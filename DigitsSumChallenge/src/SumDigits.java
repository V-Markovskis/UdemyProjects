public class SumDigits {
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
