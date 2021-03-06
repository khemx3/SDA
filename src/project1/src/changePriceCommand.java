package project1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
This class used to execute addBook method on inventory and serialize it to file.
*/
public class changePriceCommand extends Command{

    private String bookName;
    private Double newPrice;
    private Double oldPrice;
    public String fileName = "src/project1/Command.ser";

    changePriceCommand(String bookName, Double newPrice) {
        this.bookName =  bookName;
        this.newPrice = newPrice;
    }

    @Override
    public void execute(concreteInventory inventory) throws MatchNotFoundException {
        oldPrice = inventory.findBook(bookName).getPrice();
        try {
            inventory.changePrice(bookName,newPrice);
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
        inventory.changePrice(bookName,oldPrice);
    }


}
