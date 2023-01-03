import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            int age = 2022 - year;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name " + name + " your age " + age);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Unable to parse year");
        }
        scanner.close();
    }
}
