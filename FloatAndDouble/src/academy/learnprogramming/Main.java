package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float myMaxFloatNum = Float.MAX_VALUE;
	    float myMinFloatValue = Float.MIN_VALUE;

        System.out.println("Float maximum value = " + myMaxFloatNum);
        System.out.println("Float minimum value = " + myMinFloatValue);

        double myMaxDoubleNum = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        System.out.println("Double maximum value = " + myMaxDoubleNum);
        System.out.println("Double minimum value = " + myMinDoubleValue);

        int myIntNum = 5 / 2;
        float myFloatNum = 5F / 2f;
        double myDoubleNum = 5d / 2d;

        System.out.println("myIntNum = " + myIntNum);
        System.out.println("myFloatNum = " + myFloatNum);
        System.out.println("myDoubleNum = " + myDoubleNum);

        double numOfPounds = 2d;
        double numOfPoundsToKilograms = numOfPounds * 0.45359237d;
        System.out.println(numOfPoundsToKilograms);

    }
}
