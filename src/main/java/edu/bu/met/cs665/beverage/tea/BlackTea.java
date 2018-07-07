package edu.bu.met.cs665.beverage.tea;

/**
 * Class to contain any information pertaining to black tea beverages
 */
public class BlackTea extends Tea {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Black Tea";
  }

  @Override
  public String toString() {
    return "black tea";
  }

  @Override
  public int getSlotID() {
    return 4;
  }
}
