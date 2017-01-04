import java.util.Scanner;

public class TableOfPowersLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        int number;

        do {
            System.out.print("Please input an integer: ");
            number = sc.nextInt();

            System.out.println("Number      | Square      | Cube      ");
            System.out.println("--------------------------------------");

            for(int i = 1; i <= number; i++) {
                System.out.printf("%12s %12s %12s", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
                System.out.println();
            }
            System.out.print("Do you want to continue?");
            userInput = sc.next();
        } while(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the table powers app :)");
    }
}
