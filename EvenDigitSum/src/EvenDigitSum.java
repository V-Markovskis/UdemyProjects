public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int evenDigitsCounter = 0;
        while (number != 0) {
            if(number % 2 == 0) {
                int digitsExtract = number % 10;
                evenDigitsCounter += digitsExtract;
            }
            number /= 10;
        }
        return evenDigitsCounter;
    }
}
