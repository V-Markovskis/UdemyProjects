package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,2000, "white", 100);
        vehicle.move();

        Car car = new Car(4, 1500, "brown", 200, true,true,4);
        car.tricks();

        SpecificCar specificCar = new SpecificCar(2000, 250, false, true,5,5,5);
        specificCar.tricks();
        specificCar.charging();
    }
}
