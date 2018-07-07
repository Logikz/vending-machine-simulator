package edu.bu.met.cs665.state;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee.Coffee;
import edu.bu.met.cs665.beverage.tea.Tea;
import edu.bu.met.cs665.core.BrewerContext;
import edu.bu.met.cs665.io.InputChoice;
import edu.bu.met.cs665.io.InputHandler;
import java.util.ArrayList;


/**
 * Class responsible for determining what kind of beverage the user wants to brew, such as coffee or
 * tea.
 */
public class RequestBeverageState implements State {

  /**
   * Acquire the beverage we want to brew.
   */
  @Override
  public void execute(BrewerContext context) {
    InputHandler handler = context.getInputHandler();

    String beverageQuestion = "Would you like to brew tea or coffee?";
    ArrayList<InputChoice> beverageChoices = new ArrayList<>();
    beverageChoices.add(new Tea());
    beverageChoices.add(new Coffee());
    InputChoice choice = handler.requestMultipleChoice(beverageQuestion, beverageChoices);
    if (choice == null) {
      context.setNextState(new ErrorState("Invalid beverage choice.  Please try again."));
    } else {
      context.setNextState(new RequestBeverageTypeState());
      context.setBeverage((Beverage) choice);
    }
  }
}
