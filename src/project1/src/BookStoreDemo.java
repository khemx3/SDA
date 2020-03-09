package project1.src;
import java.util.*;

public class BookStoreDemo {
    public static void main(String[] args) throws MatchNotFoundException {
        decoratorInventory inventory = new decoratorInventory();
        inventory.addBook("somphon", 1.2, 4);
        inventory.listBook();
        inventory.listCommand();
    }
}
//        boolean run = true;
//        decoratorInventory inventory = new decoratorInventory();
//        inventory.getState();
//
//        while(run){
//            System.out.println("Press 1 to save the progress");
//            System.out.println("Press 2 to add new books");
//            System.out.println("Press 3 to to sell a book");
//            System.out.println("Press 4 to add more copies of books");
//            System.out.println("Press 5 to change the book price");
//            System.out.println("Press 6 to list all book");
//            System.out.println("Press 7 to list all command");
//            System.out.println("Press 8 to redo command");
//            System.out.println("Press 9 to exit");
//            Scanner input = new Scanner(System.in);
//            int choice = input.nextInt();
//            Scanner in = new Scanner(System.in);
//            switch (choice){
//                case 1:
//                    System.out.println("Enter book name, price and quality:");
//                    String name  = in.nextLine();
//                    Double price = in.nextDouble();
//                    Integer quantity = in.nextInt();
//                    inventory.addBook(name,price,quantity);
//                    break;
//                case 2:
//                    System.out.println("Enter sold book");
//                    String bookname = in.nextLine();
//                    inventory.sellBook(bookname);
//                    break;
//                case 3:
//                    System.out.println("Enter book that already in database and quality");
//                    String target_add = in.nextLine();
//                    int quality = in.nextInt();
//                    inventory.addCopy(target_add,quality);
//                    break;
//                case 4:
//                    System.out.println("Enter book and new price");
//                    String bookName = in.nextLine();
//                    Double newPrice = in.nextDouble();
//                    inventory.changePrice(bookName,newPrice);
//                    break;
//                case 5:
//                    System.out.println("Saving the progress! ");
//                    inventory.saveState();
//                    break;
//                case 6:
//                    System.out.println("listing all of the book ");
//                    inventory.listBook();
//                    break;
//                case 7:
//                    System.out.println("Command previously are");
//                    inventory.listCommand();
//                    break;
//                case 8:
//                    System.out.println("Eeroll the previous command");
//                    inventory.reroll();
//                    break;
//                case 9:
//                    System.out.println("Exit");
//                    run = false;
//                    break;
//                default:
//                    System.out.println("Invalid command!");
//            }
//        }
//
//    }
//}