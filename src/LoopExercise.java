/**
 * Created by Moravia on 1/4/17.
 */
public class LoopExercise {


    public static void main(String[] args) {

        System.out.println("While loop example: ");
        short number = 5;
        while(number <= 15) {
            System.out.println(number);
            number++;
        }

        System.out.println("-----");
        System.out.println("Do-while exercise");
        int i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while (i < 1000000);



    }
}
