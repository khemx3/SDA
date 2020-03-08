package project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class addBookCommand extends Command implements Serializable{

    private Book book;
    public String fileName = "Command.ser";

    addBookCommand(Book newBook) { this.book =  newBook; }

    @Override
    public void execute(concreteInventory inventory) {

        inventory.addBook(book);

        try {
            FileOutputStream fileOut = new FileOutputStream(fileName,true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        } catch (IOException i) {

        }
    }
}
