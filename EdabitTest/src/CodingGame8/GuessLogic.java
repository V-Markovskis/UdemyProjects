package CodingGame8;

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
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        int[] numCounters = new int[N];
        for (int i = 0; i < N; i++) {
            String ROW = in.nextLine().replaceAll("\\s", "");
            String[] splitRow = ROW.split("");
            int numCounter = 0;
            for(int j = 0; j < splitRow.length; j++) {
                if(splitRow[j].matches("\\d")) {
                    numCounter++;
                }
            }
            numCounters[i] = numCounter;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        for (int i = 0; i < N; i++) {
            System.out.println(numCounters[i]);
        }
    }
}