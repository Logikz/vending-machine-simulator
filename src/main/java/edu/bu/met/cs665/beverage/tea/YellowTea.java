package edu.bu.met.cs665.beverage.tea;

/**
 * Class to contain any information pertaining to yellow tea
 */
public class YellowTea extends Tea {

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Yellow Tea";
  }

  @Override
  public String toString() {
    return "yellow tea";
  }

  @Override
  public int getSlotID() {
    return 6;
  }
}
