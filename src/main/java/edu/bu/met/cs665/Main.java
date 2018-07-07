package edu.bu.met.cs665;

import edu.bu.met.cs665.core.BrewerController;
import edu.bu.met.cs665.io.ConsoleInput;
import edu.bu.met.cs665.io.ConsoleOutput;

public class Main {

  /**
   * Main entry into the application.
   *
   * @param args Any command line args passed into the application, not used.
   */
  public static void main(String[] args) {
    // Get an instance of BrewerController to manage the application
    BrewerController controller = new BrewerController(new ConsoleInput(), new ConsoleOutput());

    controller.start();
  }

}