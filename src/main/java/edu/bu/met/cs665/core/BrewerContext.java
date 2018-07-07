package edu.bu.met.cs665.core;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.io.InputHandler;
import edu.bu.met.cs665.io.OutputHandler;
import edu.bu.met.cs665.state.RequestBeverageState;
import edu.bu.met.cs665.state.State;

/**
 * State information about the brewing processing, including the type of beverage and amount of
 * units of each condiment selected.  Also controls the flow of the next state to enter.  This
 * allows for each state to define what the next state should be, in case of errors or if there are
 * drinks with customized states in the future, for example, iced vs hot tea, or a conditional
 * condiment, like honey for green tea.
 */
public class BrewerContext {

  private Beverage beverage;
  private State nextState;
  private final InputHandler inputHandler;
  private final OutputHandler outputHandler;

  /**
   * Constructor using dependency injection for inputs/outputs
   */
  public BrewerContext(InputHandler inputHandler, OutputHandler outputHandler) {
    reset();
    this.inputHandler = inputHandler;
    this.outputHandler = outputHandler;
  }

  /**
   * The current beverage to brew
   *
   * @return A Beverage
   */
  public Beverage getBeverage() {
    return beverage;
  }

  /**
   * The current beverage to brew
   *
   * @param beverage A beverage
   */
  public void setBeverage(Beverage beverage) {
    this.beverage = beverage;
  }


  /**
   * The next state to enter
   *
   * @return A state
   */
  public State getNextState() {
    return nextState;
  }

  /**
   * The next state to enter
   *
   * @param nextState A state
   */
  public void setNextState(State nextState) {
    this.nextState = nextState;
  }

  /**
   * Access to the input handler interface
   *
   * @return Handler to obtaining user input
   */
  public InputHandler getInputHandler() {
    return inputHandler;
  }

  /**
   * Access to the output handler interface
   *
   * @return Handler to dispensing the beverage
   */
  public OutputHandler getOutputHandler() {
    return outputHandler;
  }

  /**
   * Resets the context to default values, useful for going back to the beginning
   */
  public void reset() {
    this.beverage = null;
    this.nextState = new RequestBeverageState();
  }
}
