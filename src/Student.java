/**
 * Created by Moravia on 1/9/17.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int score;
    private int age;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }



    public String getFullName() {
        return firstName + " " + lastName;
    }
}
