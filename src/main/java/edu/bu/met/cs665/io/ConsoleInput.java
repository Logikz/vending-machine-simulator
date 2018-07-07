package edu.bu.met.cs665.io;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implementation of InputHandler to allow for the console to query for user input
 */
public class ConsoleInput implements InputHandler {

  /**
   * Asks the user a multiple choice question using the console as input.  Performs basic input
   * validation to enforce selection within bounds.
   *
   * @param question Question to ask the user
   * @param choices ArrayList of choices to select from
   * @return String of the choice.
   */
  @Override
  public InputChoice requestMultipleChoice(String question, ArrayList<InputChoice> choices) {
    // print out the question
    System.out.println(question);

    // print out the choices
    for (int i = 0; i < choices.size(); ++i) {
      System.out.printf("%d. %s%n", (i + 1), choices.get(i).getDisplayString());
    }
    Scanner scanner = new Scanner(System.in);

    int attempts = 0;
    String selection = "Selection(1-" + choices.size() + "): ";
    // Do 3 attempts to get a correct answer
    while (attempts < 3) {
      try {
        System.out.println(selection);
        String input = scanner.nextLine();
        int choice = (Integer.parseInt(input) - 1);

        return choices.get(choice);
      } catch (NumberFormatException ex) {
        System.out.println("Invalid selection. Try again.");
        ++attempts;
      }
    }

    return null;
  }

  /**
   * Asks the user a question and allows for any text input as a response.  Performs no validation
   * on the text input
   *
   * @param question Question to ask the user
   * @return String of their question
   */
  @Override
  public String requestTextInput(String question) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.nextLine();
  }
}
