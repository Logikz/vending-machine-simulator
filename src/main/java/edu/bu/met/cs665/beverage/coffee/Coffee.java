package edu.bu.met.cs665.beverage.coffee;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.condiment.Condiment;
import edu.bu.met.cs665.io.InputChoice;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.NotImplementedException;

/**
 * Base class to contain any information pertaining to Coffee beverages.
 */
public class Coffee implements Beverage, InputChoice {

  private List<Condiment> condiments;

  public Coffee() {
    condiments = new ArrayList<>();
  }

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Coffee";
  }

  @Override
  public String toString() {
    return "coffee";
  }

  @Override
  public int getSlotID() {
    throw new NotImplementedException();
  }

  @Override
  public List<Condiment> getCondiments() {
    return condiments;
  }

  @Override
  public void addCondiment(Condiment condiment) {
    condiments.add(condiment);
  }
}
