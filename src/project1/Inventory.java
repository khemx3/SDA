package project1;

public interface  Inventory {
    void addBook(Book book);
    void sellBook(Integer bookID);
    void addCopy(Integer bookID, Integer numberOfCopy);
    void changePrice(Integer bookID, Double newPrice);
    Integer findIdByName(String bookName);
    Double findPriceById(Integer bookID);
    void saveState();
    void getState();

}
