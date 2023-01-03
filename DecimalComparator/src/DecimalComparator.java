public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        long testForNum1 = (long) (num1 * 1000);
        long testForNum2 = (long) (num2 * 1000);

        return testForNum1 == testForNum2;
    }
}
