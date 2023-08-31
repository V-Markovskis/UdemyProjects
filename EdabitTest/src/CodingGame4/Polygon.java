package CodingGame4;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int degrees = in.nextInt();

        int sides = 360 / (180 - degrees);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sides);
    }
}