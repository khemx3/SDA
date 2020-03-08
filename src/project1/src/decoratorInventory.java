package project1.src;

import java.io.*;
import java.util.ArrayList;

public class decoratorInventory implements Inventory{

    private concreteInventory inventory = new concreteInventory();
    private FileInputStream fileIn ;
    private ArrayList<Command> commandList = new ArrayList<Command>();
    private CareTaker careTaker = new CareTaker();
    private Memento memento = new Memento();
    private String CommandFileName = "src/project1/Command.ser";


    public concreteInventory getInventory() {
        return inventory;
    }

    public void setInventory(concreteInventory inventory) {
        this.inventory = inventory;
    }

    public void addBook(Book book) {
        addBookCommand addBook = new addBookCommand(book);
        addBook.execute(inventory);

    }

    public void sellBook(String bookName) throws MatchNotFoundException {
        sellBookCommand sellBook = new sellBookCommand(bookName);
        sellBook.execute(inventory);

    }

    public void addCopy(String bookName, Integer numberOfCopy) throws MatchNotFoundException {
        addCopyCommand addCopyCommand = new addCopyCommand(bookName,numberOfCopy);
        addCopyCommand.execute(inventory);
    }

    public void changePrice(String bookName, Double newPrice) throws MatchNotFoundException {
        changePriceCommand changePriceCommand = new changePriceCommand(bookName,newPrice);
        changePriceCommand.execute(inventory);
    }

    public Integer findIdByName(String bookName) throws MatchNotFoundException {
        try {
            return inventory.findIdByName(bookName);

        } catch (MatchNotFoundException e) {

            throw new MatchNotFoundException("No Match Found");
        }
    }

    public Double findPriceById(Integer bookID) throws MatchNotFoundException {
        try {

            return inventory.findPriceById(bookID);

        } catch (MatchNotFoundException e) {

            throw new MatchNotFoundException("No Match Found");
        }
    }

    /**
     * This method get the commands from file
     * and also runs them to inventory object
     */

    private void replyCommands(concreteInventory inventory){

        try {
            fileIn = new FileInputStream(CommandFileName);
            while (true) {
                ObjectInputStream input = new ObjectInputStream(fileIn);
                commandList.add((Command) input.readObject());
            }
        }catch (EOFException e) {

            try{
                fileIn.close();
            }catch(IOException i)
            {
                i.printStackTrace();
            }

        }catch(IOException i)
        {
            i.printStackTrace();
        }catch(ClassNotFoundException c)
        {
            System.out.println("class not found");
            c.printStackTrace();
        }

        for(Command command : commandList){
            command.execute(inventory);
        }
    }

    @Override
    public void saveState() {
        memento.saveState(inventory.getBookList());
        careTaker.serializeMemento(memento);

        File file = new File(CommandFileName);
        file.delete();

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getState() {
        memento = careTaker.deserializeMemento();
        inventory.setBookList(memento.getState());
        this.replyCommands(inventory);
    }

    public void listBook(){
        inventory.listBook();
    }


}
