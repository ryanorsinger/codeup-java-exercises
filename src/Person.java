/**
 * Created by Moravia on 1/6/17.
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected String email;


    static int numberOfPeople;

    public Person(String firstName, String lastName, String email) {
        numberOfPeople++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public static boolean peopleHaveBirthdays() {
        return true;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
