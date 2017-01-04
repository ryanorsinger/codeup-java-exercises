import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double length;
        String name;
        String userWantsToContinue;

        do {

            System.out.println("We're seeing if moving from a string input to a number input causes a problem...");
            System.out.println("Then we'll see if getting numbers after getting string input is a challenge");
            System.out.print("Please input your name: ");
            name = sc.nextLine();
            System.out.println("Hello, " + name + " and welcome to the room size calculator!");

            System.out.print("Please input the length of the room: ");
            length = sc.nextDouble();

            System.out.print("Please input the room's width: ");
            width = sc.nextDouble();

            System.out.println("The area is " + (width * length));
            System.out.println("The perimeter is " + (2 * (width + length)));

            // Ensure that the scanner doesn't assign an empty string on next input
            sc.nextLine();

            System.out.print("Type 'yes' to continue: ");
            userWantsToContinue = sc.nextLine();

        } while (userWantsToContinue.equals("yes") || userWantsToContinue.equals("y"));

        System.out.println("Thank you, come again!");
    }
}

