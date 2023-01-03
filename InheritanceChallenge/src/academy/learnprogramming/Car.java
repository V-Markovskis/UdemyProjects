package academy.learnprogramming;

public class Car extends Vehicle {
    private boolean handSteering;
    private boolean changingGears;
    private int sitBelts;


    public Car(int wheels, int weightKg, String color, int maxSpeedKmH, boolean handSteering, boolean changingGears, int sitBelts) {
        super(4, weightKg, color, maxSpeedKmH);
        this.changingGears = changingGears;
        this.handSteering = handSteering;
        this.sitBelts = sitBelts;
    }

    @Override
    public void tricks() {
        System.out.println("Car can drift " + getMaxSpeedKmH());
        super.tricks();
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public boolean isChangingGears() {
        return changingGears;
    }

    public int getSitBelts() {
        return sitBelts;
    }
}
