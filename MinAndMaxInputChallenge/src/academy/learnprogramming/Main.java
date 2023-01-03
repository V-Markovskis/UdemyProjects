package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int minValue = Integer.MAX_VALUE;
//        int maxValue = Integer.MIN_VALUE;  //better to use this option

        int minValue = 0;
        int maxValue = 0;


        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt) {
                int userInput = sc.nextInt();
                if(userInput > maxValue) {
                    maxValue = userInput;
                } else if (userInput < minValue || minValue == 0) { //or use boolean flag for the first num and set min/max to it
                    minValue = userInput;
                }
            } else {
                break;
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println("Min value = " + minValue + " and max value = " + maxValue);
    }
}
