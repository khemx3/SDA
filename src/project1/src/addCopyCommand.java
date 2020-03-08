package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class addCopyCommand extends Command{

    private Integer bookId;
    private Integer numberOfCopy;
    public String fileName = "src/project1/Command.ser";

    addCopyCommand(Integer bookID, Integer numberOfCopy) { this.bookId =  bookID;
    this.numberOfCopy = numberOfCopy;}

    @Override
    public void execute(concreteInventory inventory) {

        try {
            inventory.addCopy(bookId,numberOfCopy);
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
