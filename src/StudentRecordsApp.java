import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Moravia on 11/28/16.
 */

public class StudentRecordsApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the student records application");

        // create a new arrayList for storing student objects
        ArrayList<Student> students = new ArrayList<Student>();

        String userChoice;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Validator validator = new Validator(scan);

        do {
            userChoice = validator.getString("Type \"index\" to show all students and \"add\" to add a new student, or \"q\" to quit");
            if(userChoice.equalsIgnoreCase("index")) {
                showIndexOfStudents(students);
            } else if(userChoice.equalsIgnoreCase("add")) {
                students = addStudentToList(validator, students);
            }

        } while (!userChoice.equalsIgnoreCase("q"));

        System.out.println("Thank you for using the Codeup student records app!");
    }

    private static ArrayList<Student> addStudentToList(Validator validator, ArrayList<Student> students) {
        String userContinue = "y";

        do {
            Student newStudent = getNewStudent(validator);
            students.add(newStudent);
            userContinue = validator.getString("Do you want to add another student? Type \"y\" to continue.");
            System.out.println(userContinue);

        } while(userContinue.equalsIgnoreCase("y"));

        return students;
    }

    private static Student getNewStudent(Validator validator) {
        String firstName = validator.getString("First name: ");
        String lastName = validator.getString("Last name: ");
        int score = validator.getIntWithinRange("score: ", 0, 100);
        return new Student(firstName, lastName, score);
    }

    private static void showIndexOfStudents(ArrayList<Student> students) {
        if(students.size() == 0) {
            System.out.println("There are no student records yet.");
        }

        for(Student student : students) {
            System.out.println(student.getFullName() + " has a score of: " + student.getScore());
        }

    }
}
