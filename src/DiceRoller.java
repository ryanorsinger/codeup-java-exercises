import java.util.Scanner;

/**
 * Created by Moravia on 1/6/17.
 */
public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("Welcome to diceroller app!");

        playGame();

    }

    public static void playGame() {
        boolean playAgain = false;

        Scanner scan = new Scanner(System.in);
        do {

            // Ask the user to enter the number of sides for a pair of dice.
            int numberOfSidesPerDie = getNumberOfSidesFromUser();
            System.out.println("You have a " + numberOfSidesPerDie + " sided die...");

            // “Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            int dieOne = rollDie(numberOfSidesPerDie);
            int dieTwo = rollDie(numberOfSidesPerDie);

            System.out.println("You rolled a " + dieOne + " and a " + dieTwo + ".");
            System.out.println("Together, your total is " + (dieOne + dieTwo));

            System.out.println("Do you want to roll the dice again? ");
            if(scan.nextLine().equalsIgnoreCase("yes")) {
                playAgain = true;
            }
        } while(playAgain);
    }

    // Use static methods to implement the method(s) that generate the random numbers.
    public static int rollDie(int numberOfSidesPerDie) {
        // Random number generation in Java
        // Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.
        return (int) Math.ceil(Math.random() * numberOfSidesPerDie);
    }

    public static int getNumberOfSidesFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many sides does your die have? ");
        return scan.nextInt();
    }


}
