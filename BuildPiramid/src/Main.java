import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String C = in.nextLine();

        int rows = 5, k = 0;

        for (int i = 1; i <= N; ++i, k = 0) {
            for (int space = 1; space <= N - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(C + " ");
                ++k;
            }

            System.out.println();
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}