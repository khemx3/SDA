package project1.src;

public class BookStoreDemo {
    public static void main(String[] args) throws MatchNotFoundException {
        decoratorInventory inventory1 = new decoratorInventory();
        inventory1.saveState();
        inventory1.addBook("Dog", 10.0, 3);
        inventory1.addBook("Doge", 10.0, 5);
        inventory1.saveState();
        inventory1.listBook();

        decoratorInventory inventory2 = new decoratorInventory();
        inventory2.getState();
        inventory2.addBook("Doggy", 10.0, 3);
        inventory2.addBook("Dogger", 10.0, 3);
        inventory2.addBook("Pitch", 10.0, 3);
        inventory2.sellBook("Pitch");
        inventory2.reroll();
        inventory2.sellBook("Pitch");
        inventory2.saveState();
        inventory2.listBook();

        decoratorInventory inventory3 = new decoratorInventory();
        inventory3.getState();
        inventory3.changePrice("Doggy",15.0);
        inventory3.changePrice("Doggy",12.0);
        inventory3.reroll();
        inventory3.saveState();
        inventory3.listBook();

        decoratorInventory inventory4 = new decoratorInventory();
        inventory4.getState();
        inventory4.addCopy("Doggy",10);
        inventory4.addCopy("Doggy",5);
        inventory4.reroll();
        inventory4.saveState();
        inventory4.listBook();


    }
}
//package project1.src;
//import java.util.*;
//
//public class BookStoreDemo {
//    public static void main(String[] args) throws MatchNotFoundException {
//
////        decoratorInventory inventory = new decoratorInventory();
////        inventory.addBook("somphon", 1.2, 4);
////        inventory.listBook();
////        inventory.listCommand();
////    }
////}
//        boolean run = true;
//        decoratorInventory inventory = new decoratorInventory();
//        inventory.getState();
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
//                    System.out.println("Saving the progress! ");
//                    inventory.saveState();
//                    break;
//                case 2:
//                    System.out.println("Enter book name, price and quality:");
//                    String name  = in.nextLine();
//                    Double price = in.nextDouble();
//                    Integer quantity = in.nextInt();
//                    inventory.addBook(name,price,quantity);
//                    break;
//                case 3:
//                    System.out.println("Enter sold book");
//                    String bookname = in.nextLine();
//                    inventory.sellBook(bookname);
//                    break;
//                case 4:
//                    System.out.println("Enter book that already in database and quality");
//                    String target_add = in.nextLine();
//                    int quality = in.nextInt();
//                    inventory.addCopy(target_add,quality);
//                    break;
//                case 5:
//                    System.out.println("Enter book and new price");
//                    String bookName = in.nextLine();
//                    Double newPrice = in.nextDouble();
//                    inventory.changePrice(bookName,newPrice);
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