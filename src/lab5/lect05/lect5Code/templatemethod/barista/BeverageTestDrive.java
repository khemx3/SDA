package lab5.lect05.lect5Code.templatemethod.barista;

import lab5.lect05.lect5Code.templatemethod.barista.Coffee;
import lab5.lect05.lect5Code.templatemethod.barista.Tea;

public class BeverageTestDrive {
  public static void main(String[] args) {

    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    System.out.println("\nMaking tea...");
    tea.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();


    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();

    System.out.println("\nMaking tea...");
    teaHook.prepareRecipe();

    System.out.println("\nMaking coffee...");
    coffeeHook.prepareRecipe();
  }
}
