package project1.src;

public interface  Inventory {
    void addBook(Book book);
    void sellBook(String bookName) throws MatchNotFoundException;
    void addCopy(String bookName, Integer numberOfCopy) throws MatchNotFoundException;
    void changePrice(String bookName, Double newPrice) throws MatchNotFoundException;
    Integer findIdByName(String bookName) throws MatchNotFoundException;
    Double findPriceById(Integer bookID) throws MatchNotFoundException;
    void saveState();
    void getState();

}
