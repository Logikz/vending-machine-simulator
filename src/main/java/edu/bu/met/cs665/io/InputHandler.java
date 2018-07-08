package edu.bu.met.cs665.io;

import java.util.List;

/**
 * Interface for requesting input from the user.  The implementor can gain these values through
 * whatever means makes sense, whether it is a console application, a GUI or something built into a
 * vending machine.
 */
public interface InputHandler {

  /**
   * Display a list of choices for the user to select from.
   *
   * @param question Question to display to the user
   * @param choices List of choices to select from
   * @return The choice from the list
   */
  InputChoice requestMultipleChoice(String question, List<InputChoice> choices);

  /**
   * This is a more generalized input gathering function with no validation.  It simply returns the
   * input to the caller to handle.  This is useful for gathering unknown quantities of a condiment
   * to add to a beverage, the implementor can abstract how they want to display this information to
   * the user, whether it is a integer value or a GUI showing NONE, LOW, MEDIUM, etc type images to
   * select from.
   */
  String requestValueInput(String question);
}
