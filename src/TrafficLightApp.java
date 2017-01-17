/**
 * Created by Moravia on 1/12/17.
 */
public class TrafficLightApp {
    public static void main(String[] args) {

        System.out.println("Let's play in traffic! ");

        System.out.println("You will be asked to provide a color for the light...");
        TrafficLightColor randomLightColor = TrafficLightColor.getTrafficLightColor();
        TrafficLightColor.makeDrivingDecision(randomLightColor);

        System.out.println("Now, the light will randomly select");
        randomLightColor = TrafficLightColor.getRandomLight();
        TrafficLightColor.makeDrivingDecision(randomLightColor);

    }
}
