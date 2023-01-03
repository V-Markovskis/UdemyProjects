package academy.learnprogramming;

public class Bed {
    private int length;
    private int width;
    private String model;

    public Bed(int length, int width, String model) {
        this.length = length;
        this.width = width;
        this.model = model;
    }

    public void emotionsFromBed() {
        System.out.println("The bed is soft!");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getModel() {
        return model;
    }
}
