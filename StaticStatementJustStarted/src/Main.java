public class Main {

    public static int multiplayer = 7;
    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplayer);

    }

    public static int multiply(int number) {
        return number * multiplayer;
    }
}