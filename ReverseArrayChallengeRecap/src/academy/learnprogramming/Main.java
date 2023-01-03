package academy.learnprogramming;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,2,3,4,5};
        reverse(myArray);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int temp;
        int n = array.length;
        for(int i = 0; i < n/2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
