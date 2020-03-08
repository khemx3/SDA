package project1.src;

public class BookStoreDemo {
    public static void main(String[] args) throws MatchNotFoundException {
        decoratorInventory inventory = new decoratorInventory();
        inventory.addBook(new Book("ABC", 100.0, 5));
        inventory.addBook(new Book("Dog", 10.0, 3));



        inventory.saveState();
        inventory.listBook();

        System.out.printf("Test\n");

        decoratorInventory inventory1 = new decoratorInventory();
        inventory1.getState();
        inventory1.addBook(new Book("Dog", 10.0, 3));
        inventory1.saveState();
        inventory1.listBook();

        decoratorInventory inventory2 = new decoratorInventory();
        inventory2.getState();
        inventory2.listBook();
        inventory2.addBook(new Book("Doge", 10.0, 3));
        inventory2.saveState();
        inventory2.listBook();

    }
}
