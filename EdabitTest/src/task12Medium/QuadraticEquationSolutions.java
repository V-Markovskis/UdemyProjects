package task12Medium;

import static task12Medium.Challenge.solutions;

public class QuadraticEquationSolutions {
    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));  // Output: 2
        System.out.println(solutions(1, 0, 0));   // Output: 1
        System.out.println(solutions(1, 0, 1));   // Output: 0
    }
}

class Challenge {
    public static int solutions(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            return 2;  // Two distinct real solutions
        } else if (discriminant == 0) {
            return 1;  // One real solution (repeated root)
        } else {
            return 0;  // No real solutions
        }
    }
}