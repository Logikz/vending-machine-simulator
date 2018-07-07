package edu.bu.met.cs665.beverage.coffee;

/**
 * Class to contain any information pertaining to Americano
 */
public class Americano extends Coffee {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Americano";
  }

  @Override
  public String toString() {
    return "americano";
  }

  @Override
  public int getSlotID() {
    return 1;
  }
}
