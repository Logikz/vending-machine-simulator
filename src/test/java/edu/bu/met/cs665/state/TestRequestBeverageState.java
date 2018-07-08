package edu.bu.met.cs665.state;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.bu.met.cs665.beverage.coffee.Coffee;
import edu.bu.met.cs665.beverage.tea.Tea;
import edu.bu.met.cs665.core.BrewerContext;
import edu.bu.met.cs665.io.InputChoice;
import edu.bu.met.cs665.io.InputHandler;
import java.util.List;
import org.junit.jupiter.api.Test;


class TestRequestBeverageState {

  @Test
  void test_beverage_selection() {
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

    State state = new RequestBeverageState();

    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestBeverageTypeState);
    assertTrue(testContext.getBeverage() instanceof Tea);

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

    state = new RequestBeverageState();

    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof RequestBeverageTypeState);
    assertTrue(testContext.getBeverage() instanceof Coffee);
  }

  @Test
  void test_beverage_bad_input() {
    // Set up the context for testing
    BrewerContext testContext = new BrewerContext(new InputHandler() {
      @Override
      public InputChoice requestMultipleChoice(String question, List<InputChoice> choices) {
        return null;
      }

      @Override
      public String requestValueInput(String question) {
        return null;
      }
    }, null);

    State state = new RequestBeverageState();

    state.execute(testContext);

    // validate the context
    assertTrue(testContext.getNextState() instanceof ErrorState);
    assertNull(testContext.getBeverage());
  }

}
