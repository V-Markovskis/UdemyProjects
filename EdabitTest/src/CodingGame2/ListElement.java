package CodingGame2;

import java.util.*;

/**
 * Are you a good square calculator ?
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // The number of integers to be squared
        for (int i = 0; i < N; i++) {
            int s = in.nextInt(); // An integer to be squared
            if(Math.pow(s, 2) % 3 == 0) {
                if(i == 2) {
                    System.out.print("threeIsGood");
                    break;
                }
                System.out.print("threeIsGood" + " ");
            } else {
                if(i == 2) {
                    System.out.print(Math.round(Math.pow(s,2)));
                    break;
                }
                System.out.print(Math.round(Math.pow(s,2)) + " ");
            }
        }



        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}