package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class  sellBookCommand extends Command{

    private String bookName;
    public String fileName = "src/project1/Command.ser";

    sellBookCommand(String bookName) {
        this.bookName=  bookName;
    }

    @Override
    public void execute(concreteInventory inventory) {
        try {
            inventory.sellBook(bookName);
        } catch (MatchNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fileOut = new FileOutputStream(fileName,true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        } catch (IOException i) {

        }
    }

    @Override
    public void rollback(concreteInventory inventory)throws MatchNotFoundException {
        Book book = inventory.findBook(this.bookName);
        inventory.addBook(book.getName(),book.getPrice(),1);

    }
}
