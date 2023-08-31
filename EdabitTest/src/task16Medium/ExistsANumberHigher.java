package task16Medium;

import java.util.Arrays;

public class ExistsANumberHigher {
    public static void main(String[] args) {
        System.out.println(ExistsANumberHigherSolution.existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        System.out.println(ExistsANumberHigherSolution.existsHigher(new int[]{1, 2, 3, 4, 5}, 8));
        System.out.println(ExistsANumberHigherSolution.existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2}, 4));
        System.out.println(ExistsANumberHigherSolution.existsHigher(new int[]{}, 5));
    }
}

class ExistsANumberHigherSolution {
    public static boolean existsHigher(int[] arr, int n) {
        if(arr.length == 0) {
            return false;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= n) {
                return true;
            }
        }
        return false;


//        return Arrays.stream(arr).anyMatch(value -> value >= n);
    }
}
