package project1;

public class BookStoreDemo {
    public static void main(String[] args) {
        decoratorInventory inventory = new decoratorInventory();
        String name;
        Double price;
        Integer id;

        inventory.addBook(new Book("ABC", 100.0, 5));
        inventory.addBook(new Book("Dog", 10.0, 3));

        try {
            name = "ABC";
            id = inventory.findIdByName(name);
            price = inventory.findPriceById(id);
            System.out.println("Match found id: " + id + "\tname: " + name + "\tprice : " + price);
        } catch(MatchNotFoundException e)
        {
            System.out.println("Match not found ");
        }

        decoratorInventory inventory2 = new decoratorInventory();
        inventory2.saveState();
        inventory2.getState();
    }
}
