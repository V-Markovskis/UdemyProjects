package academy.learnprogramming;

public class Key {
    private String color;
    private String material;
    private int weight;

    public Key(String color, String material, int weight) {
        this.color = color;
        this.material = material;
        this.weight = weight;
    }

    public boolean position(boolean isKey) {
        return isKey;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getWeight() {
        return weight;
    }
}
