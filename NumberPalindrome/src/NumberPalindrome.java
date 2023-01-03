public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;

        if(number < 0) {
            number *= -1;
        }

        int numberFromParameters = number;

        while (numberFromParameters > 0) {
            int lastDigit;
            lastDigit = numberFromParameters % 10;

            reverse *= 10;
            reverse += lastDigit;

            numberFromParameters /= 10;
        }

        System.out.println(reverse);

        return number == reverse;
    }
}
