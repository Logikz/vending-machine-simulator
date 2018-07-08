package edu.bu.met.cs665.io;

import edu.bu.met.cs665.beverage.Beverage;

/**
 * Interface to handle dispensing a beverage to a consumer, whether it's a console application and
 * merely used to test functionality, or for a physical machine to implement and perform physical
 * retrieval and dispensing of a beverage.
 */
public interface OutputHandler {

  void displayErrorMessage(String message);

  void dispenseBeverage(Beverage beverage);
}
