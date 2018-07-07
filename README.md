# CS665 Summer 2018 Assignment 1

This is assignment 1 for CS665 Summer 2018.  The following readme can be used to guide the user 
to install and run the application using Java.  

-Nick Cuneo


# Program Assumptions

For this application, I created to simulate a self-service vending machine to dispense tea, and coffee.  
As part of this assumption, since it is simulated using a console, I tried to mimic functionality I would
expect to see from similar hardware.  As such I am under the assumptions that beverages are pre-mixed
and obtained from some kind of slot or holster to mix with water before dispensing and adding 
condiments after the fact.  I did not take into account any physical actions of obtaining the formular
such as if the slot was empty or low, nor did I take into account any hardware issues that might arise,
although my implementation would allow for easy extendibility into this region should a gui or hardware
be needed.  Because I am also similating a user interface for a vending machine, the program does not
exit when finished dispersing or reaches an error state, as the vending machine needs to continue to operate.

# Implementation Description

TBD

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




