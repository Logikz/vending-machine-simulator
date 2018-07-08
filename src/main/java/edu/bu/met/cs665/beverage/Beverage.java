package edu.bu.met.cs665.beverage;

import edu.bu.met.cs665.condiment.Condiment;
import java.util.List;

/**
 * Beverage interface to hold any common methods related to beverages.
 */
public interface Beverage {

  /* The slot id is the location of the recipe to mix. */
  int getSlotID();

  List<Condiment> getCondiments();

  void addCondiment(Condiment condiment);

  List<Condiment> getAddableCondiments();
}
