package task1;

public class TaskMain {
    public static void main(String[] args) {
        boolean[] array = {true, false, false, true, false};
        System.out.println(HowMuchIsTrue.countTrue(array));
    }
}

class HowMuchIsTrue {
    public static int countTrue(boolean[] arr) {

        if(arr.length == 0) {
            return 0;
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                count++;
            }
        }
        return count;
    }
}
