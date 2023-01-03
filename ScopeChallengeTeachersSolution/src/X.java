import java.util.Scanner;

public class X {
    private int x;

    // Optional Extra:
    // Change your program so that ALL variables (including the scanner
    // instance) are called x.
    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for(int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
