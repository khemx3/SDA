package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class sellBookCommand extends Command{

    private Integer bookID;
    public String fileName = "src/project1/Command.ser";

    sellBookCommand(Integer BookID) { this.bookID =  BookID; }

    @Override
    public void execute(concreteInventory inventory) {
        try {
            inventory.sellBook(bookID);
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
}
