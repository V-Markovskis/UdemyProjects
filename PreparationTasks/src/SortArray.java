import java.util.Arrays;

public class SortArray {
    public int[] bubbleSort(int[] array, int length) {
        for(int i = 0; i < length - 1; i++) {

            for(int j = 0; j < length - i - 1; ++j) {

                if(array[j + 1] < array [j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }
}
