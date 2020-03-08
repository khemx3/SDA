package project1.src;

public class BookStoreDemo {
    public static void main(String[] args) throws MatchNotFoundException {
        decoratorInventory inventory = new decoratorInventory();
        inventory.addBook(new Book("My name is somphon ", 10.0, 3));;
        inventory.getState();
        inventory.listBook();




    }
}
