package academy.learnprogramming;

class Car {
    private String name;
    private int cylinders;
    private String engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = "4FP";
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Engine is off";
    }

    public String accelerate() {
        return "Accelerator show zero";
    }

    public String brake() {
        return "Car is stopped";
    }
}

class SubclassCar1 extends Car {
    public SubclassCar1() {
        super("Astra",5);
    }

    @Override
    public String startEngine() {
        return "Engine is started in ASTRA car";
    }

    @Override
    public String brake() {
        return "Car ASTRA is stopped";
    }
}

class SubclassCar2 extends Car {
    public SubclassCar2() {
        super("Mazda", 6);
    }

    @Override
    public String startEngine() {
        return "Engine is started in Mazda car";
    }

    @Override
    public String brake() {
        return "Car MAZDA is stopped";
    }
}

class SubclassCar3 extends Car {
    public SubclassCar3() {
        super("Opel", 7);
    }

    @Override
    public String startEngine() {
        return "Engine is started in OPEL car";
    }

    @Override
    public String brake() {
        return "Car OPEL is stopped";
    }
}


public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " = " + car.getName() + "\n" + car.startEngine() + "\n" + car.accelerate() + "\n");
        }
    }


    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new SubclassCar1();
            case 2:
                return new SubclassCar2();
            case 3:
                return new SubclassCar3();
            default:
                return null;
        }
    }
}
