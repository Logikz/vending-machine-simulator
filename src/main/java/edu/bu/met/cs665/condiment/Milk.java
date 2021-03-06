package edu.bu.met.cs665.condiment;

/**
 * Class to contain any information pertaining to the milk condiment. Milk can have up to 3 units
 * inputted
 */
public class Milk implements Condiment {

  private static final int MAX_UNITS = 3;
  private int dispensingUnits = 0;


  @Override
  public int getMaxUnits() {
    return MAX_UNITS;
  }

  @Override
  public void setDispensingUnits(int units) {
    dispensingUnits = units;
  }

  @Override
  public int getDispensingUnits() {
    return dispensingUnits;
  }

  @Override
  public String toString() {
    return "milk";
  }
}
