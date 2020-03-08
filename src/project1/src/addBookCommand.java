package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class addBookCommand extends Command{

    private Book book;
    public String fileName = "src/project1/Command.ser";

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