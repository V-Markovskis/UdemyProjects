package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
    }

    public static void reverse(int[] array) {
        int temp;

        for(int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }


}
