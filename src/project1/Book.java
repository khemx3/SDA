package project1;

public class Book {
    private Double price;
    private Integer uniqueID, quantity;
    private String name;
    private static int count = 0;

    Book(String newName, Double newPrice, Integer newQuantity ){
        this.name = newName;
        this.price = newPrice;
        this.uniqueID = ++count;
        this.quantity = newQuantity;
    }

    public void changeQuantity(int change){
        this.quantity += change;
    }

    public Double getPrice() { return price; }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUniqueID() { return uniqueID; }
    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
