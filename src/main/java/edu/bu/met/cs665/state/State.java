package edu.bu.met.cs665.state;

import edu.bu.met.cs665.core.BrewerContext;

public interface State {

  void execute(BrewerContext context);

}
