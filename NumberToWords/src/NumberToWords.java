public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }

            reverseNumber /= 10;
        }
    }


    public static int reverse (int number) {
        int reverse = 0;
        for (int i = number; i != 0; i /= 10) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int counter = 0;
        do {
            counter++;
            number /= 10;
        } while (number != 0);
        return counter;
    }
}
