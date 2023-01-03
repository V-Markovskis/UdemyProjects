package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArrayHere = readIntegers(5);
        System.out.println(Arrays.toString(myArrayHere));

        System.out.println(findMin(myArrayHere));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter array element " + count);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if(minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
