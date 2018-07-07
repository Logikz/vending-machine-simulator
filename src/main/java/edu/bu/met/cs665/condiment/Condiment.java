package edu.bu.met.cs665.condiment;

/**
 * Condiment interface to hold any common methods related to condiments
 */
public interface Condiment {

  /**
   * The maximum number of units a condiment can hold
   *
   * @return integer of the number of units
   */
  int getMaxUnits();

  /**
   * Set the amount to dispense when we brew
   *
   * @param units number of units to dispense
   */
  void setDispensingUnits(int units);

  /**
   * Get the amount to dispense when we brew
   *
   * @return number of units to dispense
   */
  int getDispensingUnits();
}
