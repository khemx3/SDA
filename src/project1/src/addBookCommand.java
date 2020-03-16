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
    Double price;
    String name;
    Integer qualiity;

    addBookCommand(String name,double price,Integer qualiity) {
        this.name = name;
        this.price = price;
        this.qualiity = qualiity;
    }

    @Override
    public void execute(concreteInventory inventory) throws MatchNotFoundException {

        inventory.addBook(name,price,qualiity);

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
        for (Integer i = 0; i < qualiity; i++) {
            inventory.sellBook(name);
        }
    }
}

