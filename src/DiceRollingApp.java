import java.util.Scanner;

/**
 * Prompt user for number of sides of dice
 * Create two dice dice objects (using the Dice class)
 * Make sure that each dice object is created with the specified number of sides
 * Roll each die object and add the results
 * Prompt the user to continue
 */
public class DiceRollingApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "no";
        System.out.println("The number of dice in the world is " + Die.numberOfDiceCreated);
        String message;

        System.out.println("Welcome to the dice rolling app");
        do {
            message = rollTwoDice(scan);
            System.out.println(message);

            System.out.print("Do you want to continue? Type 'yes'");
            userChoice = scan.next();

        } while (userChoice.equalsIgnoreCase("yes"));
        System.out.println("The number of dice created in the world " + Die.numberOfDiceCreated);
        System.out.println("Thanks for rolling the dice!");

    }

    public static String rollTwoDice(Scanner scan) {
        // prompt the  user for the numberOfSides
        // roll two dice with that numberOfSides
        // output the sum of both
        int numberOfSides;

        System.out.print("How many sides should the dice have? ");
        numberOfSides = scan.nextInt();

        Die firstDie = new Die(numberOfSides);
        firstDie.roll();

        Die secondDie = new Die(numberOfSides);
        secondDie.roll();

        return "You rolled a " + firstDie.currentValue + " and a " + secondDie.currentValue + ".";

    }
}
