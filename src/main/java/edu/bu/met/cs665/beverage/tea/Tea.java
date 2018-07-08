package edu.bu.met.cs665.beverage.tea;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.condiment.Condiment;
import edu.bu.met.cs665.condiment.Milk;
import edu.bu.met.cs665.condiment.Sugar;
import edu.bu.met.cs665.io.InputChoice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Base class to contain any information related to tea beverages
 */
public class Tea implements Beverage, InputChoice {

  private List<Condiment> condiments;

  public Tea() {
    condiments = new ArrayList<>();
  }

  /**
   * Display string for input choice
   *
   * @return display string
   */
  @Override
  public String getDisplayString() {
    return "Tea";
  }

  @Override
  public String toString() {
    return "tea";
  }

  @Override
  public int getSlotID() {
    throw new IllegalStateException();
  }

  @Override
  public List<Condiment> getCondiments() {
    return condiments;
  }

  @Override
  public void addCondiment(Condiment condiment) {
    condiments.add(condiment);
  }

  @Override
  public List<Condiment> getAddableCondiments() {
    return Arrays.asList(new Milk(), new Sugar());
  }
}
