package project1.src;

import java.io.Serializable;
import java.util.ArrayList;

public class Memento implements Serializable {

    private ArrayList<Book> bookList;

    public void saveState(ArrayList<Book> newMovieCollection){

        this.bookList = new ArrayList<Book>(newMovieCollection);

    }

    public ArrayList<Book> getState(){

        return this.bookList;

    }



}
