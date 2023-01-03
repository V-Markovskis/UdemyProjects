public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int digitNum1;
        int digitNum2;
        int digitNum3;
        while (num1 != 0 || num2 != 0 || num3 != 0) {
            digitNum1 = num1 % 10;
            digitNum2 = num2 % 10;
            digitNum3 = num3 % 10;

            if(digitNum1 == digitNum2 || digitNum1 == digitNum3 || digitNum2 == digitNum3) {
                return true;
            }

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            if(num1 / 10 == 0 || num2 / 10 == 0 || num3 / 10 == 0) {
                break;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
