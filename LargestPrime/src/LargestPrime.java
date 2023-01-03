
public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int i;
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput;i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }
        return i;
    }


}
