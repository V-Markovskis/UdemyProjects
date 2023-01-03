import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        NumSumRecap numSumRecap = new NumSumRecap();
//        System.out.println(numSumRecap.numSumRecap(5,4,6));

//        IntegerSum integerSum = new IntegerSum();
//        System.out.println(integerSum.sum(4,5,3));

//        SortArray sortArray = new SortArray();
//        System.out.println(Arrays.toString(sortArray.bubbleSort(array, len)));


        int[] arrayToTest = {12,3,4,1,22,11};
        BubbleSearchRecap bubbleSearchRecap = new BubbleSearchRecap();
        System.out.println(Arrays.toString(bubbleSearchRecap.arrayToSort(arrayToTest)));

    }
}