package academy.learnprogramming;

public class SpecificCar extends Car {
    private int chairs;
    private int windows;


    public SpecificCar(int weightKg, int maxSpeedKmH, boolean handSteering, boolean changingGears, int sitBelts, int chairs, int windows) {
        super(5, weightKg, "black", maxSpeedKmH, handSteering, changingGears, sitBelts);
        this.chairs = chairs;
        this.windows = windows;
    }

    public void charging() {
        System.out.println("SpecificCar needs electricity to move");
    }

    @Override
    public void tricks() {
        System.out.println("SpecificCar can talk with me");
        super.tricks();
    }

    public int getChairs() {
        return chairs;
    }

    public int getWindows() {
        return windows;
    }
}
