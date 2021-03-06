package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class addCopyCommand extends Command{


    private String bookName;
    private Integer numberOfCopy;
    public String fileName = "src/project1/Command.ser";

    addCopyCommand(String bookName, Integer numberOfCopy) { this.bookName =  bookName;
    this.numberOfCopy = numberOfCopy;}

    @Override
    public void execute(concreteInventory inventory) {

        try {
            inventory.addCopy(bookName,numberOfCopy);
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
    public void rollback(concreteInventory inventory) throws MatchNotFoundException {
        for (Integer i = 0; i < numberOfCopy; i++) {
            inventory.sellBook(bookName);
        }
    }
}
