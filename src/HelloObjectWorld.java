/**
 * static properties belong to the class or can be accessed off the class W/O an object
 *
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to the object oriented Hello World app!");

        System.out.println("Number of people in the universe " + Person.getNumberOfPeople());

        Person me = new Person("Ryan", "Orsinger", "ryan@codeup.com");

        System.out.println("Hello, " + me.getFirstName());
    }


}
