package CodingGame16;

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
        int st = in.nextInt(); // starting floor
        int t = in.nextInt(); // seconds for the elevator to move from one floor to the next
        int n = in.nextInt(); // button pressed

        int totalTime = 0;
        for (int i = 0; i < n; i++) {
            int f = in.nextInt(); //floor the elevator must reach
            totalTime += t * Math.abs(f - st);
            st = f; // Update the current floor
        }
        System.out.println(totalTime);



        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}