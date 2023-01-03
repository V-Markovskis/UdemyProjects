package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String numString = "20.55";
	    double numStringToInt = Double.parseDouble(numString);
	    numStringToInt += 10.10;
        System.out.println(numStringToInt);
    }
}
