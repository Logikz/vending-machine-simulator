package edu.bu.met.cs665.state;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.condiment.Condiment;
import edu.bu.met.cs665.condiment.Milk;
import edu.bu.met.cs665.condiment.Sugar;
import edu.bu.met.cs665.condiment.Unit;
import edu.bu.met.cs665.core.BrewerContext;
import edu.bu.met.cs665.io.InputHandler;
import java.util.Locale;

/**
 * Class responsible for determining what condiments the user wants to include in their drink, such
 * as Milk or Sugar.
 */
public class RequestCondimentsState implements State {

  /**
   * Asks the user how much of each kind of condiment they would like
   *
   * @param context The context containing state information
   */
  @Override
  public void execute(BrewerContext context) {
    InputHandler inputHandler = context.getInputHandler();
    Condiment milk = new Milk();
    Condiment sugar = new Sugar();


    // Get milk
    try {
      requestCondimentUnits(context.getBeverage(), milk, inputHandler);
    } catch (IllegalArgumentException e) {
      context.setNextState(new ErrorState("Invalid input for milk.  Please try again."));
      return;
    }

    // Get sugar
    try {
      requestCondimentUnits(context.getBeverage(), sugar, inputHandler);
    } catch (IllegalArgumentException e) {
      context.setNextState(new ErrorState("Invalid input for sugar.  Please try again."));
      return;
    }

    context.setNextState(new BrewBeverageState());
  }

  private void requestCondimentUnits(Beverage beverage, Condiment condiment,
      InputHandler inputHandler) throws IllegalArgumentException {
    int attempts = 0;

    Locale currentLocale = Locale.getDefault();
    String unitString = Unit.METRIC_UNIT.toString();
    // This is not a complete list of imperial countries, but rather serves as an example of the unit enum
    if ("US".equals(currentLocale.getCountry())) {
      unitString = Unit.IMPERIAL_UNIT.toString();
    }

    // Get sugar
    while (attempts < 3) {
      try {
        String choice = inputHandler.requestValueInput(
            "How many units of " + condiment.toString() + " would you like?\nUnits are "
                + unitString + " each. [0-3]");
        int units = Integer.parseInt(choice);
        if (units >= 0 && units <= condiment.getMaxUnits()) {
          condiment.setDispensingUnits(units);
          beverage.addCondiment(condiment);
          break;
        }
        ++attempts;
      } catch (NumberFormatException e) {
        ++attempts;
      }
    }
    if (attempts >= 3) {
      throw new IllegalArgumentException("Max attempts exceeded");
    }
  }
}
