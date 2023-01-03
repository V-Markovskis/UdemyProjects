package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double result = calcFeetAndInchesToCentimeters(100);
        System.out.println(result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            double centimetres = (feet * 12 + inches) * 2.54;
            return centimetres;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            int inchesToFeet = (int) (inches / 12);
            inches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(inchesToFeet, inches);
        } else {
            return -1;
        }
    }
}
