package academy.learnprogramming;

public class Table {
    private int length;
    private int width;
    private int height;
    private String material;

    public Table(int length, int width, int height, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }

    public void tableHeightChange(int meters) {
        System.out.println("Table height changed to " + meters + " meters.");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
}
