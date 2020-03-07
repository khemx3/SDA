package project1;

public interface  Inventory {
    void addBook(Book book);
    void sellBook(Integer bookID) throws MatchNotFoundException;
    void addCopy(Integer bookID, Integer numberOfCopy) throws MatchNotFoundException;
    void changePrice(Integer bookID, Double newPrice) throws MatchNotFoundException;
    Integer findIdByName(String bookName) throws MatchNotFoundException;
    Double findPriceById(Integer bookID) throws MatchNotFoundException;
    void saveState();
    void getState();

}
