
public class Factorial {
    public static void main(String[] args) {
        int userInteger = 5;

        formatFactorialResults(userInteger);
    }

    public static int calculateFactorial(int number) {
        int answer = 1;

        for(int i = 1; i <= number; i++) {
            answer *= i;
        }

        return answer;
    }

    public static void formatFactorialResults(int number) {
        String factorialString = "";

        for(int i = 1; i<= number; i++) {
            factorialString += i + "! = " + getFactorialPieces(i) + " which equals " + calculateFactorial(i);
            factorialString += "\n";
        }

        System.out.println(factorialString);
    }

    public static String getFactorialPieces(int number) {
        String factorialPieces;

        if(number == 1) {
            return Integer.toString(number);
        } else {
            factorialPieces = Integer.toString(number);
            for(int i = 2; i <= number; i++) {
                factorialPieces += " x " + i;
            }
        }

        return factorialPieces;
    }
}
