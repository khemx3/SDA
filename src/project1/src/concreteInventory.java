package project1.src;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class concreteInventory implements Inventory {

    private ArrayList<Book> bookList = new ArrayList <Book>();
    private Memento memento = new Memento();
    private decoratorInventory inventory;
    private String CommandFileName = "src/project1/Command.ser";

    public ArrayList<Book> getBookList() {
        return  bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }


    public void addBook(Book book) {
        bookList.add(book);
        this.saveState();
    }

    /* to use this sellBook() method, quantity if that id must more than 1 */
    public void sellBook(Integer bookID) throws MatchNotFoundException{
        for (Book book : bookList) {
            if (book.getUniqueID().equals(bookID) && book.getQuantity() > 1) {
                book.changeQuantity(-1);
                this.saveState();
            }
            return;
        }
        throw new MatchNotFoundException("No Match Found");
    }


    public void addCopy(Integer bookID, Integer numberOfCopy) throws MatchNotFoundException{
        for (Book book: bookList ) {
            if (book.getUniqueID().equals(bookID)) {
                book.changeQuantity(numberOfCopy);
                this.saveState();
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }


    public void changePrice(Integer bookID, Double newPrice) throws MatchNotFoundException{
    }

    /* find id using name*/
    public Integer findIdByName(String bookName) throws MatchNotFoundException{
        for(Book book: bookList) {
            if(book.getName().equals(bookName)) {
                return book.getUniqueID();
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }

    /* find price using id*/
    public Double findPriceById(Integer bookID) throws MatchNotFoundException {
        for (Book book: bookList) {
            if (book.getUniqueID().equals(bookID)) {
                return book.getPrice();
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }


    /*
    This method saves the state of inventory to file
    and delete the commnadfile.
    */
    public void saveState() {
        memento.saveState(bookList);
        File file = new File(CommandFileName);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    This method get the previous state of inventory from file
    and also runs command to take inventory to original state
    */
    public void getState() {
        inventory.getState();
        bookList = (inventory.getInventory().getBookList());
    }
}
