## Remote Control Project

### Week 1 Homework for Skill Distillery

#### Overview

* This is a remote control simulation.

This program simulates a remote control by requiring the user to power the virtual device [ON] before any other functionality is enabled.
Once the virtual device has been powered on, the buttons become enabled and return "BOOP" when pressed until the virtual device is powered [OFF]

#### Concepts

* Loops

##### do-while Loops

The do-while loop is similar to the while loop, except the condition is placed after the loop body.

do {
  loop body
} while (condition);

The condition is checked at the end of each execution of the loop body; it determines if the loop body should execute again.
* This means that a do-while loop body will always execute at least once.

Notable do-while differences:
* do-while must have a semicolon at the end.
* do-while will execute at least once.

int num = 999;
do {
  System.out.println("num is " + num); //will execute even though num is not 0
} while (num == 0);

* Variable scope

This is mentioned because the boolean variable turnedOn is used to define the condition for the first do-while loop and is then used in the next method as the break case when it is changed back to a false value. However the true value is not stored from the first method and has to be redeclared in the method for pressing buttons because it falls out of scope.

* Switch

Because we are returning the same result ("BOOP!") for multiple conditions a switch is easier to write than an if else statement.

#### Technologies Used

* Java
* Spotify
* Eclipse IDE
* Atom
* Shell

#### Lessons Learned

See Variable Scope notes above.
