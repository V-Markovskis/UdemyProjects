package CodingGame15;

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
        int flourTotal = in.nextInt();
        int sugarTotal = in.nextInt();
        int eggsTotal = in.nextInt();
        int flourRequired = in.nextInt();
        int sugarRequired = in.nextInt();
        int eggsRequired = in.nextInt();


        HashMap<Integer, Integer> cakeIngredients = new HashMap<>();
        cakeIngredients.put(flourTotal, flourRequired);
        cakeIngredients.put(sugarTotal, sugarRequired);
        cakeIngredients.put(eggsTotal, eggsRequired);

        int cakeCounter = Integer.MAX_VALUE;
        for(int key: cakeIngredients.keySet()) {
            int counter = key / cakeIngredients.get(key);
            if(counter < cakeCounter) {
                cakeCounter = counter;
            }
        }

        System.out.println(cakeCounter);


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}