package edu.bu.met.cs665.beverage.coffee;

/**
 * Class to contain any information pertaining to Latte Macchiato beverages
 */
public class LatteMacchiato extends Coffee {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Latte Macchiato";
  }

  @Override
  public String toString() {
    return "Latte Macchiato";
  }

  @Override
  public int getSlotID() {
    return 3;
  }
}
