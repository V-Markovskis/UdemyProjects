package CodingGame5;

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
        String WORDS = in.nextLine();
        String TYPED = in.nextLine();
        int TIME = in.nextInt();

        String[] wordsSplit = WORDS.split("");
        String[] typedSplit = TYPED.split("");

        int errorCount = 0;
        for(int i = 0; i < wordsSplit.length; i++) {
            if(!wordsSplit[i].equals(typedSplit[i])) {
                errorCount++;
            }
        }

        System.out.println((TYPED.length() / 5 - errorCount) / (TIME * 60));

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");



    }
}