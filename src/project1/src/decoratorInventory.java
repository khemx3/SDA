package project1.src;

import java.io.*;
import java.util.ArrayList;

public class decoratorInventory implements Inventory{

    private concreteInventory inventory;
    private FileInputStream fileIn;
    private ArrayList<Command> commandList;
    private ArrayList<Command> oldCommandList;
    private CareTaker careTaker;
    private Memento memento;
    private String CommandFileName;
    private String oldCommandFileName;

    public decoratorInventory()
    {
        inventory = new concreteInventory();
        commandList = new ArrayList<Command>();
        oldCommandList = new ArrayList<Command>();
        careTaker = new CareTaker();
        memento = new Memento();
        CommandFileName = "src/project1/Command.ser";
        oldCommandFileName = "src/project1/oldCommand.ser";
    }
    public concreteInventory getInventory() {
        return inventory;
    }

    public void setInventory(concreteInventory inventory) {
        this.inventory = inventory;
    }

    public void addBook(String name,double price,Integer qualiity) throws MatchNotFoundException {
        addBookCommand addBook = new addBookCommand(name,price,qualiity);
        commandList.add(addBook);
        addBook.execute(inventory);

    }

    public void sellBook(String bookName) throws MatchNotFoundException {
        sellBookCommand sellBook = new sellBookCommand(bookName);
        commandList.add(sellBook);
        sellBook.execute(inventory);

    }

    public void addCopy(String bookName, Integer numberOfCopy) throws MatchNotFoundException {
        addCopyCommand addCopyCommand = new addCopyCommand(bookName,numberOfCopy);
        commandList.add(addCopyCommand);
        addCopyCommand.execute(inventory);
    }

    public void changePrice(String bookName, Double newPrice) throws MatchNotFoundException {
        changePriceCommand changePriceCommand = new changePriceCommand(bookName,newPrice);
        commandList.add(changePriceCommand);
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
    public void reroll() throws MatchNotFoundException {
        Command command = commandList.get(commandList.size()-1);
        command.rollback(inventory);
        commandList.remove(commandList.size()-1);
    }
    public void listCommand()
    {
        for(Command i: commandList)
        {
           System.out.println(i);
        }
    }
    private void replyCommands(concreteInventory inventory) throws MatchNotFoundException {

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

    public void saveState() {
        memento.saveState(inventory.getBookList());
        careTaker.serializeMemento(memento);
        commandList = new ArrayList<Command>();
        File file = new File(CommandFileName);
        try {
            FileOutputStream fileOut = new FileOutputStream(oldCommandFileName,true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(file);
            out.close();
            fileOut.close();
            file.delete();
        } catch (IOException i) { file.delete();
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getState() throws MatchNotFoundException {
        try {
            memento = careTaker.deserializeMemento();
            inventory.setBookList(memento.getState());
            this.replyCommands(inventory);
        } catch (Exception e) {
            this.replyCommands(inventory);
        }
    }

    public void listBook(){
        inventory.listBook();
    }
}
