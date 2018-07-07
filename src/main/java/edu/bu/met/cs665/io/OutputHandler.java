package edu.bu.met.cs665.io;

import edu.bu.met.cs665.beverage.Beverage;

public interface OutputHandler {

  void displayErrorMessage(String message);

  void dispenseBeverage(Beverage beverage);
}
