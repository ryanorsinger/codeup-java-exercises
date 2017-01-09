import java.util.Scanner;

/**
 * Created by Moravia on 1/5/17.
 */
public class BasicMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the first number");
        int firstNumber = scan.nextInt();

        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();

        int addResult = add(firstNumber, secondNumber);
        System.out.println("The result of adding " + firstNumber + " and " + secondNumber + " is " + addResult);

        int subtractResult = subtract(firstNumber, secondNumber);
        System.out.println("The result of subtracting " + firstNumber + " from " + secondNumber + " is " + subtractResult);

        int multiplyResult = multiply(firstNumber, secondNumber);
        System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is " + multiplyResult);

        double divideResult = divide(firstNumber, secondNumber);
        System.out.println("The result of dividing " + firstNumber + " into " + secondNumber + " is " + divideResult);

        int moduloResult = modulo(firstNumber, secondNumber);
        System.out.println("The result of modulo of " + firstNumber + " on " + secondNumber + " is " + moduloResult);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if(b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return  (double) a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }



}
