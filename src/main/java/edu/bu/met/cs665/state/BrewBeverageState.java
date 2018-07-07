package edu.bu.met.cs665.state;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.core.BrewerContext;

/**
 * Class responsible for brewing the beverage
 */
public class BrewBeverageState implements State {

  /**
   * Handles brewing the beverage
   *
   * @param context Context containing state information
   */
  @Override
  public void execute(BrewerContext context) {
    Beverage beverage = context.getBeverage();
    if (beverage == null) {
      context.setNextState(new ErrorState("Unknown beverage supplied"));
      return;
    }

    context.getOutputHandler().dispenseBeverage(beverage);
    context.reset();
  }
}
