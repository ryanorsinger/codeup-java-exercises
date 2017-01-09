import java.util.Scanner;

/**
 * Created by Moravia on 1/3/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User();

        System.out.print("What's the username: ");
        user.username = scan.nextLine();

        System.out.print("Input you password: ");
        user.password = scan.nextLine();

        System.out.print("What's your email address? ");
        user.email = scan.nextLine();

        System.out.println("Hello, " + user.username);
        System.out.println("We sent your sign-up instructions to " + user.email);

        user.login("admin", "password");
    }
}
