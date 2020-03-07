package project1;

import java.io.*;

public class CareTaker {
    private Object object;
    private String temporaryFileName = "temporaryInventory.ser";
    private String fileName = "Inventory.ser";
    private File tempFile = new File(temporaryFileName);
    private File file = new File(fileName);
    byte[] buf = new byte[1024];
    int bytesRead;

    public void serializeMemento(Memento state) {
        // object to stream
    }

    public Memento deserializeMemento() {
        // stream to object
        return null;
    }
}
