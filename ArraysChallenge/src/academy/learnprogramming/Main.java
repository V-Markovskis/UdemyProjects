package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInteger(5);
        printArray(myArray);
        sortArray(myArray);

        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Element of the sorted array " + myArray[i]);
        }
    }

    public static int[] getInteger(int numberOfElements) {
        int[] arrayFromInput = new int[numberOfElements];
        System.out.println("Print array " + numberOfElements + " elements");
        for(int i = 0; i < arrayFromInput.length; i++) {
            arrayFromInput[i] = sc.nextInt();
        }
        return arrayFromInput;
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++ ) {
            System.out.println("Element of the array " + arrayToPrint[i]);
        }
    }

    public static int[] sortArray(int[] sortedArray) {
        Arrays.sort(sortedArray);
        reverse(sortedArray);

        System.out.println(Arrays.toString(sortedArray));

        return sortedArray;
    }

    public static void reverse(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
            //System.out.println(array[i]);

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
            //System.out.println(temp);
        }
    }
}

