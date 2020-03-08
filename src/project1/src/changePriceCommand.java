package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class changePriceCopyCommand extends Command{

    private Integer bookId;
    private Double newPrice;
    public String fileName = "src/project1/Command.ser";

    changePriceCopyCommand(Integer bookID, Double newPrice) {
        this.bookId =  bookID;
        this.newPrice = newPrice;
    }

    @Override
    public void execute(concreteInventory inventory) {

        try {
            inventory.changePrice(bookId,newPrice);
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
