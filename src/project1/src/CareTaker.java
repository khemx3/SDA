package project1.src;

import java.io.*;

public class CareTaker {
    private Object object;
    private String fileName = "src/project1/Inventory.ser";
    byte[] buf = new byte[1024];
    int bytesRead;

    public void serializeMemento(Memento state) {
        // object to stream
        try
        {
            FileOutputStream temporaryFileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(temporaryFileOut);
            out.writeObject(state);
            out.close();
        }catch(IOException i) {}
    }

    public Memento deserializeMemento() {
        // stream to object
        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            object = in.readObject();
            in.close();
            fileIn.close();
            return (Memento)object;
        }catch(IOException i)
        {
            return null;

        }catch(ClassNotFoundException c)
        {
            System.out.println("class not found");
            return null;
        }
    }
}
