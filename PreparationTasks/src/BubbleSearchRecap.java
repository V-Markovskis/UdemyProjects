public class BubbleSearchRecap {
    public int[] arrayToSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {

            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j+1] < array[j]) {
                    int tempValue = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempValue;
                }
            }
        }
        return array;
    }
}
