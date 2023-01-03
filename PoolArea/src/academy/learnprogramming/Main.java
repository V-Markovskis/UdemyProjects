package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());

        Cuboid narandome = new Cuboid(5,10,5);
        System.out.println("Cuboid.width = " + narandome.getWidth());
        System.out.println("Cuboid.length = " + narandome.getLength());
        System.out.println("Cuboid.area = " + narandome.getArea());
        System.out.println("Cuboid.height = " + narandome.getHeight());
        System.out.println("Cuboid.volume = " + narandome.getVolume());
    }
}
