package CodingGame9;

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
        String isLeap = in.nextLine();
        String yearType = in.nextLine();

        int daysInYear = 0;

        if(isLeap.equals("LEAP")) {
            daysInYear = 29 * 6 + 30 * 5;
        } else {
            daysInYear = 29 * 5 + 30 * 5;
        }

        if(yearType.equals("MISSING")) {
            daysInYear += 29 * 2;
        } else if (yearType.equals("SERIAL")) {
            daysInYear += 29 + 30;
        } else {
            daysInYear += 30 * 2;
        }

        System.out.println(daysInYear);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}