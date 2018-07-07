package edu.bu.met.cs665.beverage.tea;

/**
 * Class to contain any information pertaining to green tea beverages
 */
public class GreenTea extends Tea {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Green Tea";
  }

  @Override
  public String toString() {
    return "green tea";
  }

  @Override
  public int getSlotID() {
    return 5;
  }
}
