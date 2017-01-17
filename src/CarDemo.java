/**
 * Created by Moravia on 1/17/17.
 */
public class CarDemo {
    public static void main(String[] args) {

        System.out.println("The number of cars produced is " + Car.numberOfCarsProduced);

        Car myCar = new Car("VW", "Bug", 3456777);
        System.out.println("My car is a " + myCar.make + " " + myCar.model);

        System.out.println("There are " + Car.numberOfCarsProduced + " cars.");

        Car yourCar = new Car("Toyota", "Corolla", 4567);
        System.out.println("Your car is a " + yourCar.make + " " + yourCar.model);

        System.out.println("We now have " + Car.numberOfCarsProduced + " cars.");

        System.out.print("The cars on recall right now are ");
        Car.getCarsThatHaveBeenRecalled();

    }
}
