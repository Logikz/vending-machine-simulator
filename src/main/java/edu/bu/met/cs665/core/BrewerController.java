package edu.bu.met.cs665.core;

import edu.bu.met.cs665.io.InputHandler;
import edu.bu.met.cs665.io.OutputHandler;

/***
 * BrewerController is a class to manage the Brewing application.  It will contain all the
 * necessary state information as well as manage the flow of the application.
 */
public class BrewerController {

  private final BrewerContext context;

  /**
   * We inject our io handler to this method such that we can abstract how we ask the user for io.
   * If we want to use a console, or write a gui, simply implement the interface
   */
  public BrewerController(InputHandler input, OutputHandler output) {
    this.context = new BrewerContext(input, output);
  }

  /**
   * Runs the application
   */
  public void start() {
    while (context.getNextState() != null) {
      context.getNextState().execute(context);
    }
  }
}
