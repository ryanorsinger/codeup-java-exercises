import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userWantsToContinue;
        int grade;
        String message;

        System.out.println("Welcome to the student grading application!");

        do {
            System.out.println("What is the student's numerical grade?");
            grade = sc.nextInt();

            if(grade >= 88) {
                message = "Student made an A";
            } else if(grade >= 80) {
                message = "Student made a B";
            } else if(grade >= 67) {
                message = "Student made a C";
            } else if(grade >= 60) {
                message = "Student made a D";
            } else {
                message = "Student made an F. Try again!";
            }

            System.out.println(message);
            System.out.print("Do you want to grade/judge another student?");

            userWantsToContinue = sc.next();

        } while (userWantsToContinue.equalsIgnoreCase("yes"));
    }
}
