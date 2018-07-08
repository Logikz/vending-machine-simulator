package edu.bu.met.cs665.io;

/**
 * Used to encapsulate a class as a multiple choice value, allows the class to offer a display
 * string to the user when it's used as a multiple choice value.
 */
public interface InputChoice {

  /**
   * String to display in some sort of UI
   *
   * @return String
   */
  String getDisplayString();
}
