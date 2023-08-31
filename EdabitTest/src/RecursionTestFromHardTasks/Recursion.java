package RecursionTestFromHardTasks;

public class Recursion {
        static int factorial(int n) {
            int result;

            if (n < 2) {
                return 1;
            }
            result = factorial(n - 1) * n;
            return result;
        }

        public static void main(String[] args) {
            System.out.println("Факториал 3: " + factorial(3));
            System.out.println("Факториал 4: " + factorial(4));
            System.out.println("Факториал 5: " + factorial(5));
        }

        //fac(4) - chain starts => end return 24
        //fac(3) * 4 = 6 * 4 = 24
        //fac(2) * 3 = 2 * 3 = 6
        //fac(1) * 2 = 1 * 2 = 2
        //fat(1) returns 1
    }

