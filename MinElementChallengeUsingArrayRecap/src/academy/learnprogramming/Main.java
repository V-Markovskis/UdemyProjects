package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readElements(readIntegers());
        System.out.println("Min number in array = " + findMin(myArray));

    }

    public static int readIntegers() {
        System.out.println("Enter number of elements\r");
        int elementNum = scanner.nextInt();
        scanner.nextLine();

        return elementNum;
    }

    public static int[] readElements(int number) {
        int[] array = new int[number];
        System.out.println("Enter number(-s) " + number + "\r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }
}
