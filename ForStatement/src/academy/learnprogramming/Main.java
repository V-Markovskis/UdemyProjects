package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));


        for(int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        System.out.println("\n");

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println("******************");
        System.out.println(isPrime(2));
        System.out.println("**********************");

        int count = 0;
        for(int i = 1; i < 20; i++) {
            if(isPrime(i)) {
                System.out.println("Prime number: " + i);
                count++;
            }
            if (count == 5) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
