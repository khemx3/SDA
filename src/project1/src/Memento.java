package project1.src;

import java.io.Serializable;
import java.util.ArrayList;

public class Memento implements Serializable {

    private ArrayList<Book> bookList;

    public void saveState(ArrayList<Book> newBookList){

        this.bookList = new ArrayList<Book>(newBookList);

    }

    public ArrayList<Book> getState(){

        return this.bookList;

    }



}
