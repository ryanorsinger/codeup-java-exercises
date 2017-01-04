/**
 * Created by Moravia on 1/3/17.
 */
public class TypesDemo {
    // create variables of every primitive type and print them to the console
    // try to assign a character to a variable that has been declared as an int
    // try to define a variable with the name class
    // initialize a variable, but do not assign it a value, then try and print it to the console

    public static void main(String[] args) {
        boolean isMonday;
        byte smallestByte = Byte.MIN_VALUE;
        byte byteVariable = Byte.MAX_VALUE;
        int minutesInaMonth = 525600;
        float pi = 3.1F;
        double morePrecisePi = 3.1415926;

        long maxLong = Long.MAX_VALUE;
        String maxLongAsString = Long.toString(maxLong);

        long maxLongPlusOne = maxLong + 1;
        long maxLongPlusTwo = maxLong + 2;

        System.out.println("The largest long value is " + maxLong);
        System.out.println("The maximum long plus one is " + maxLongPlusOne);
        System.out.println("The max log plus two is " + maxLongPlusTwo);

        int favoriteNumber;
        favoriteNumber = 'c';
        int favoriteCapitalLetter = 'C';
        System.out.println("My favorite letter is " + favoriteNumber);
        System.out.println("My favorite capital letter is " + favoriteCapitalLetter);

        boolean myCatIsACat;
        myCatIsACat = true;

        System.out.println(myCatIsACat);

    }
}
