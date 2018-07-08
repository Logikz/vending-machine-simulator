# CS665 Summer 2018 Assignment 1

This is assignment 1 for CS665 Summer 2018.  The following readme can be used to guide the user 
to install and run the application using Java.  

-Nick Cuneo


# Program Assumptions

This application simulates a self-service vending machine to dispense tea, and coffee. As part of 
this assumption, since it is simulated using a console, I tried to mimic functionality I would
expect to see from similar hardware.  As such I am under the assumptions that beverages are pre-mixed
and obtained from some kind of slot or holster to mix with water before dispensing and adding 
condiments after the fact.  I did not take into account any physical actions of obtaining the formula
such as if the slot was empty or low, nor did I take into account any hardware issues that might arise,
although my implementation would allow for easy extendability into this region should a gui or hardware
be needed.  Because I am also simulating a user interface for a vending machine, the program does not
exit when finished dispersing or reaches an error state, as the vending machine needs to continue to operate.

# Implementation Description

This project serves as a simple example how one can build a modular program to request information from
a user in order to dispense a beverage based on a series of selections.  The approach is to make the
implementation simple to understand and easy to extend in order to add new functionality.  Various 
design patterns were used and considered for this application.  The application was designed in a 
way to be flexible to add new condiments, beverage or even additional options for new beverages. 

For instance, here is an example of adding hot chocolate as a beverage, with an additional condiment, cinnamon.
Cinnamon is a condiment that should only be added to hot chocolate. 
First, HotChocolate class would be implemented deriving from Beverage and InputChoice.
Second, in the execute function of RequestBeverageState, we would add a new line to add this beverage
choice, beverageChoices.add(new HotChocolate());.  Additionally, when HotChocolate was picked, the next
 state would be set to RequestCondimentState, since there are no types of hot chocolate. Next we would create a new class Cinnamon, which
derives from Condiment.  The max units for cinnamon would be set to 2, rather than 3 for milk and sugar.
In the HotChocolate class, when we implement getAddableCondiments() we return a list of addable condiments,
such as milk, sugar and cinnamon (or whatever condiments make sense for you). 
Finally in RequestCondimentState, if the beverage type is HotChocolate, we would simply call
requestCondimentUnits() with this new condiment type.  This also serves as an example of reducing
duplicate code since requesting condiments are handled in a method rather than individually.

Various design patterns were thought of for this assignment, such as using a singleton for the
BrewerController, as it is a class we should try to only have one instance of in our application space.
However, singletons can be a mess to try to create test cases for, and in order to use the strategy 
pattern, I opted for the dependency injection pattern instead.  The strategy pattern was used to abstract
away the input and outputs of this application.  For this assignment we implement the input and output 
to simply write to the console, but implementations of those interfaces could allow for a GUI or a 
physical machine to retrieve and dispense the beverages.  The dependency injection pattern was used
to inject the implementation of these interfaces from the main function, if there was another entry
point to the codebase that was executed from inside a machine, then it could inject the implementation
of their choice to interact with the codebase.  Consideration was also given to the observer pattern
which would allow the input handler to notify the state classes once the proper input was retrieved,
but since the application is single threaded the decision was made to not use that pattern at this time.
The state pattern was used to control state flow throughout the application.  Each step of the brewing
process is a state which is responsible for obtaining the proper inputs to progress to the next state
of the process.

Extensive documentation exists throughout the application in the forms of javadocs as well as inline
comments.  This allows for future developers to understand the thought process and ability to work
in this code base with minimal training.




# Setup
 
You need to install Apache Maven (https://maven.apache.org/)  on your system.

# Compilation 

Compilation and packaging is done with maven, and is easily ran from windows or linux with one of
the following scripts.

## Windows
```bash
compile.bat
```

## Linux

```bash
./compile.sh
```


# Running

The application can be ran by executing one of the following scripts on windows or linux.

## Windows

```bash
run.bat
```

## Linux

```bash
./run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

To analyse this example using CheckStyle run 

```bash
mvn checkstyle:check
```


CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. You can change it to other styles like sun checkstyle. 

# Unit Tests

A sampling of unit tests are included to show functionality and to illustrate the design patterns
ability to make testing easier.  The tests themselves are by no means complete nor offer full coverage
of the assignment as it was not requested.




