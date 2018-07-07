package edu.bu.met.cs665.io;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.condiment.Condiment;
import java.util.List;

/**
 * Implementation of OutputHandler to dispense beverages to the console, rather than a machine.
 */
public class ConsoleOutput implements OutputHandler {

  /**
   * Displays an error message to the user.
   *
   * @param message A message to display
   */
  @Override
  public void displayErrorMessage(String message) {
    System.err.println(message);
  }

  /**
   * Dispensing beverage by retrieving the slot ID of the mixture.  This would probably go through a
   * physical process of checking if the slot contained more mixture or if it was empty and such,
   * but for now we will just add some stuff to the console.
   *
   * @param beverage A beverage to dispense
   */
  @Override
  public void dispenseBeverage(Beverage beverage) {
    System.out.println("=======================");
    System.out.println("==Dispensing Beverage==");
    System.out.println("=======================");

    System.out.println("Your beverage's recipe is located in slot " + beverage.getSlotID());
    System.out.println(beverage.toString() + " is being dispensed...");
    List<Condiment> condiments = beverage.getCondiments();
    condiments.forEach(condiment -> {
      if (condiment.getDispensingUnits() > 0) {
        System.out.println(
            "Adding " + condiment.getDispensingUnits() + " units of " + condiment.toString());
      }
    });

    System.out.println("Enjoy your beverage!  Caution, it's hot!");
    System.out.println("=======================");
  }
}
