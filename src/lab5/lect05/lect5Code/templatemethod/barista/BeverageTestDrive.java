package lab5.lect05.lect5Code.templatemethod.barista;

import lab5.lect05.lect5Code.templatemethod.simplebarista.Coffee;
import lab5.lect05.lect5Code.templatemethod.simplebarista.Tea;

public class BeverageTestDrive {
  public static void main(String[] args) {

    lab5.lect05.lect5Code.templatemethod.simplebarista.Tea tea = new Tea();
    lab5.lect05.lect5Code.templatemethod.simplebarista.Coffee coffee = new Coffee();

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
