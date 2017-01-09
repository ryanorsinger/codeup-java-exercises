import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Student Records App");

        System.out.println("Please input a new student: ");

        String firstName = getString("First name: ", scan);
        String lastName = getString("Last name: ", scan);
        int age = getInt("Age? ", scan);

        Student newStudent = new Student(firstName, lastName, age);
        System.out.println("Howdy there, " + newStudent.getFirstName() + " " + newStudent.getLastName() + ". You are " + newStudent.getAge() + " years old.");

    }

    private static int getInt(String prompt, Scanner scan) {

        int userInteger;
        System.out.print(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            scan.next();
            return getInt(prompt, scan);
        }

        return userInteger;
    }


    public static String getString(String prompt, Scanner scan) {
        String inputString;

        System.out.print(prompt);
        try {
            inputString = scan.nextLine();

        } catch(Exception e) {
            System.out.println("Whoops, something went wrong...");

            // Keeps the scanner from "skipping" the next input
            scan.next();
            return getString(prompt, scan);
        }

        return inputString;
    }
}
