package edu.bu.met.cs665.beverage.coffee;

/**
 * Class to contain any information pertaining to Espresso beverages
 */
public class Espresso extends Coffee {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Espresso";
  }

  @Override
  public String toString() {
    return "espresso";
  }

  @Override
  public int getSlotID() {
    return 2;
  }
}
