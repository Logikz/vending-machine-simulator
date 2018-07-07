package edu.bu.met.cs665.state;

import edu.bu.met.cs665.core.BrewerContext;

/***
 * Handles any error state the program might enter.
 */
public class ErrorState implements State {

  private final String message;

  /**
   * Constructor
   *
   * @param message Error message to display
   */
  ErrorState(String message) {
    this.message = message;
  }

  /**
   * Handle displaying a message to the user.
   *
   * @param context context containing state information
   */
  @Override
  public void execute(BrewerContext context) {
    context.getOutputHandler().displayErrorMessage(message);
    context.reset();
  }
}
