package CodingGame10;

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
        int b = in.nextInt();
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        String[] restaurantDetails = new String[n];
        for (int i = 0; i < n; i++) {
            String restaurant = in.nextLine();
            restaurantDetails[i] = restaurant;
        }

        //Array sort by 3rd element
        Arrays.sort(restaurantDetails, (r1, r2) -> {
            String[] parts1 = r1.split(" ");
            String[] parts2 = r2.split(" ");

            int value1 = Integer.parseInt(parts1[2]);
            int value2 = Integer.parseInt(parts2[2]);

            return Integer.compare(value1,value2);
        } );

        for(String restaurant: restaurantDetails) {
            System.out.println(restaurant);
        }

        System.out.println(restaurantDetails[1]);




        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}