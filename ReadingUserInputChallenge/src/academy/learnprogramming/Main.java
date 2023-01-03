package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int numberToPrint = 1;

        while (numberToPrint <= 10) {
            System.out.println("Enter number #" + numberToPrint + ":");
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt) {
                numberToPrint++;
                int numberFromInput = sc.nextInt();
                counter += numberFromInput;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine(); //handle end of the line
        }
        System.out.println(counter);
        sc.close();
    }
}
