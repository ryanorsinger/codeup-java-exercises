import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String myName = getName();
        String yourName = getName(scan);

        int favoriteNumber = getNumber(scan);

        String greeting = sayHello(myName, yourName, favoriteNumber);
        System.out.println(greeting);
    }

    public static String getName() {
        return "Ryan";
    }

    public static String getName(Scanner scan) {
        System.out.print("What do they call you? ");
        return scan.nextLine();
    }

    public static String sayHello(String myName, String yourName, int number) {
        return "Hello, " + yourName +  ". I heard your favorite number is " + number + ". My name is " + myName;
    }

    public static int getNumber(Scanner scan) {
        System.out.print("Input your favorite number: ");
        return scan.nextInt();
    }


}
