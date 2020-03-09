package project1.src;

import lab3.lab3Code.xmastree.TreeDecorator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class concreteInventory implements Inventory {

    private ArrayList<Book> bookList;
    public ArrayList<Book> getBookList() {
        return  bookList;
    }

    public concreteInventory()
    {
        bookList = new ArrayList <Book>();
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(String name,double price,Integer qualiity) throws MatchNotFoundException {
        try {
            findBook(name);
            addCopy(name,qualiity);
        }catch(MatchNotFoundException e){
            if (!bookList.isEmpty()) {
                Integer newId = bookList.get(bookList.size() - 1).getUniqueID()+1;
                Book book = new Book(newId,name,price,qualiity);
                bookList.add(book);
            } else
            {
                Book book = new Book(1,name,price,qualiity);
                bookList.add(book);
            }
        }
    }

    /* to use this sellBook() method, quantity if that id must more than 1 */
    public void sellBook(String bookName) throws MatchNotFoundException{
        for (Book book :bookList){
            if (book.getName().equals(bookName) && book.getQuantity() >= 1){
                book.changeQuantity(-1);
                return;
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }

    public void addCopy(String bookName, Integer numberOfCopy) throws MatchNotFoundException{
        for (Book book: bookList ) {
            if (book.getName().equals(bookName)){
                book.changeQuantity(numberOfCopy);
                return;
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }


    public void changePrice(String bookName, Double newPrice) throws MatchNotFoundException{
        for (Book book : bookList){
            if(book.getName().equals(bookName)){
                book.setPrice(newPrice);
                return;
            }
        }
        throw new MatchNotFoundException("No Match Found");
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

    public Book findBook(String bookName) throws  MatchNotFoundException{
        for(Book book:bookList){
            if(book.getName().equals(bookName)) {
                return book;
            }
        }
        throw new MatchNotFoundException("No Match Found");
    }
    public void listBook(){
        System.out.println("BookID\tName\t\t\tPrice\t\tQuality");
        for(Book book : bookList)
        {
            System.out.println(String.format("%s %9s %16s %14s" ,book.getUniqueID(),book.getName(),book.getPrice(),book.getQuantity()));
        }
    }
}
