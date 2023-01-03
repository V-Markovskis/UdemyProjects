package academy.learnprogramming;

public class TV {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public TV(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void tvProgram() {
        System.out.println("I liked watching this show using my bed!");
    }

    public void onOrOff(boolean isActive) {
        if(isActive) {
            System.out.println("TV is ON!");
        } else {
            System.out.println("TV is OFF!");
        }
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
