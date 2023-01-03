package academy.learnprogramming;

public class Vehicle {
    private int wheels;
    private int weightKg;
    private String color;
    private int maxSpeedKmH;

    public Vehicle(int wheels, int weightKg, String color, int maxSpeedKmH) {
        this.wheels = wheels;
        this.weightKg = weightKg;
        this.color = color;
        this.maxSpeedKmH = maxSpeedKmH;
    }

    public void tricks() {
        System.out.println("This vehicle can fly.");
    }

    public void move() {
        System.out.println("Vehicle can move.");
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeedKmH() {
        return maxSpeedKmH;
    }
}
