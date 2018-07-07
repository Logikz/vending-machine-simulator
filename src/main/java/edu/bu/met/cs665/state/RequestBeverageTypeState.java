package edu.bu.met.cs665.state;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee.Americano;
import edu.bu.met.cs665.beverage.coffee.Coffee;
import edu.bu.met.cs665.beverage.coffee.Espresso;
import edu.bu.met.cs665.beverage.coffee.LatteMacchiato;
import edu.bu.met.cs665.beverage.tea.BlackTea;
import edu.bu.met.cs665.beverage.tea.GreenTea;
import edu.bu.met.cs665.beverage.tea.Tea;
import edu.bu.met.cs665.beverage.tea.YellowTea;
import edu.bu.met.cs665.core.BrewerContext;
import edu.bu.met.cs665.io.InputChoice;
import edu.bu.met.cs665.io.InputHandler;
import java.util.ArrayList;

/**
 * Class responsible for determining what kind of beverage the user wants, for instance if we are
 * making a coffee beverage, it will ask about Americano,  Espresso or Latte Macchiato
 */
public class RequestBeverageTypeState implements State {

  /**
   * Acquire the type of beverage we want to brew
   *
   * @param context The context containing state information
   */
  @Override
  public void execute(BrewerContext context) {
    Beverage baseBeverage = context.getBeverage();
    InputHandler inputHandler = context.getInputHandler();
    String question;
    ArrayList<InputChoice> choices = new ArrayList<>();

    if (baseBeverage instanceof Tea) {
      // Ask the user what kind of tea they like
      question = "What kind of tea would you like?";
      choices.add(new BlackTea());
      choices.add(new GreenTea());
      choices.add(new YellowTea());

    } else if (baseBeverage instanceof Coffee) {
      // Ask the user what kind of coffee they like
      question = "What kind of coffee would you like?";
      choices.add(new Americano());
      choices.add(new Espresso());
      choices.add(new LatteMacchiato());
    } else {
      context.setNextState(new ErrorState("Unknown beverage selected"));
      return;
    }
    InputChoice choice = inputHandler.requestMultipleChoice(question, choices);

    if (choice == null) {
      context.setNextState(
          new ErrorState("Invalid beverage type choice selected.  Please try again."));
    } else {
      context.setBeverage((Beverage) choice);
      context.setNextState(new RequestCondimentsState());
    }
  }
}
