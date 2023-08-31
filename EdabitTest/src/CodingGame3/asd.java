package CodingGame3;

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
        String textInput = in.nextLine();
        String[] numCheck = textInput.split(" ");

        String hundred = "hundred";
        String thousand = "thousand";
        String million = "million";

        float num = Float.parseFloat(numCheck[0]);

        if (numCheck[1].equals(hundred)) {
            System.out.println(Math.round(num * 100));
        } else if (numCheck[1].equals(thousand)) {
            System.out.println(Math.round(num * 1000));
        } else {
            System.out.println(Math.round(num * 1000000));
        }

    }
}