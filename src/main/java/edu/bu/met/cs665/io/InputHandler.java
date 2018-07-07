package edu.bu.met.cs665.io;

import java.util.ArrayList;

public interface InputHandler {

  InputChoice requestMultipleChoice(String question, ArrayList<InputChoice> choices);

  String requestTextInput(String question);
}
