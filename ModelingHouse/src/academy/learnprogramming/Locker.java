package academy.learnprogramming;

public class Locker {
    private int weight;
    private String material;
    private int shelf;
    private Dimensions dimensions;
    private Key key;

    public Locker(int weight, String material, int shelf, Dimensions dimensions, Key key) {
        this.weight = weight;
        this.material = material;
        this.shelf = shelf;
        this.dimensions = dimensions;
        this.key = key;
    }

    public void isKeyOnSamePosition() {
        if(key.position(true)) {
            System.out.println("Key is on the same position");
        } else {
            System.out.println("Key is somewhere else");
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public int getShelf() {
        return shelf;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Key key() {
        return key;
    }
}
