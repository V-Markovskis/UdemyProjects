package task9;

import java.util.Arrays;

public class DifferenceOfMaxAndMinNumbersInArray {
    public static void main(String[] args) {
        System.out.println(Challenge.differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(Challenge.differenceMaxMin(new int[]{44, 32, 86, 19  }));
    }
}

class Challenge {
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}
