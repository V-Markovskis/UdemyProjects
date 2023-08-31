package CodingGame6;

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
        int R = in.nextInt();

        double T = Math.sqrt((Math.pow(R, 3)) / (7.5 * Math.pow(10, -6)));

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Math.round(T));
    }
}