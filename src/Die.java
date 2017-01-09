
/*
 * Let's create an object-oriented dice-roller app!
 * Following the general directions of the Methods exercise with the Dice roller,
 * Create a class called Die or Dice.java
    - Create your main class (the class with the main() method) and name is DiceRollingApp.java
    - Put all your user input on the DiceRollingApp
    - Your Die class should have the numberOfSides property and the roll() method defined on it
 */
public class Die {

    // The Die class is a blueprint for all dice.
    // The Die class should have variables that represent the data for each individual die.
    // class should have the behavior (methods) that a single die can do.

    public int numberOfSides;
    public int currentValue;

    public static int numberOfDiceCreated;

    // create a die
    public Die(int numberOfSides) {
        numberOfDiceCreated++;
        this.numberOfSides = numberOfSides;
    }

    // roll the die
    public int roll() {
        // generate a random number between 1 and this die's number of sides
        currentValue = (int) Math.ceil(Math.random() * numberOfSides);

        // return that random roll
        return currentValue;
    }
}
