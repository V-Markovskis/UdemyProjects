package task5;

public class ConvenienceStore {
    public static void main(String[] args) {

        System.out.println(Program.changeEnough(new int[]{2, 100, 0, 0}, 14.11));
        System.out.println(Program.changeEnough(new int[]{0, 0, 20, 5}, 0.75));
    }
}
class Program {
    public static boolean changeEnough(int[] change, double amountDue) {

        double amountInPocket = 0;
        double quarterAmount = change[0] * 0.25;
        double dimeAmount = change[1] * 0.10;
        double nickel = change[2] * 0.05;
        double penny = change[3] * 0.01;
        amountInPocket = quarterAmount + dimeAmount + nickel + penny;

        return amountInPocket >= amountDue;

//        return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue * 100;
    }
}
