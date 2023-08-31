package CodingGame14;

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
        String[] programText = in.next().split("");
        int[] brainfuckLanguage = new int[10000];
        int index = 0;

        for(int i = 0; i < programText.length; i++) {
            if(programText[i].equals("<") && index == 0) {
                index = 9999;
            } else if (programText[i].equals(">") && index == 9999) {
                index = 0;
            } else if (programText[i].equals("<")) {
                index--;
            } else if (programText[i].equals(">")) {
                index++;
            } else if (programText[i].equals("+")) {
                brainfuckLanguage[index]++;
            } else {
                brainfuckLanguage[index]--;
            }
        }

        int sum = Arrays.stream(brainfuckLanguage)
                .filter(i -> i > 0)
                .sum();


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}