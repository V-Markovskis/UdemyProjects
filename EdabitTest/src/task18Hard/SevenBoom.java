package task18Hard;

public class SevenBoom {
    public static void main(String[] args) {
        System.out.println(Challenge.sevenBoom(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(Challenge.sevenBoom(new int[]{8, 6, 33, 100}));
        System.out.println(Challenge.sevenBoom(new int[]{2, 55, 60, 97, 86}));
    }
}

class Challenge {
    public static String sevenBoom(int[] arr) {
        for (int num: arr) {
            if(Integer.toString(num).contains("7")) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
