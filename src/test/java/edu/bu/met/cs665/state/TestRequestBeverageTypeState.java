package edu.bu.met.cs665.state;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
import java.util.List;
import org.junit.jupiter.api.Test;

class TestRequestBeverageTypeState {

  @Test
  void test_beverage_type_tea() {
    // Set up the context for testing
    BrewerContext testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(0);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);
    testContext.setBeverage(new Tea());
    State state = new RequestBeverageTypeState();

    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof BlackTea);

    testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(1);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);

    testContext.setBeverage(new Tea());
    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof GreenTea);

    testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(2);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);

    testContext.setBeverage(new Tea());
    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof YellowTea);
  }

  @Test
  void test_beverage_type_coffee() {
    // Set up the context for testing
    BrewerContext testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(0);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);
    testContext.setBeverage(new Coffee());
    State state = new RequestBeverageTypeState();

    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof Americano);

    testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(1);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);

    testContext.setBeverage(new Coffee());
    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof Espresso);

    testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return choices.get(2);
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);

    testContext.setBeverage(new Coffee());
    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestCondimentsState);
    assertTrue(testContext.getBeverage() instanceof LatteMacchiato);
  }

}
