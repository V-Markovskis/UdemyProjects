package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// + - * / % covered here
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("There is no { body } syntax");
            System.out.println("We need a code block { } to execute more statements if condition is true, otherwise only one statement will be executed");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("No Error!");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("No supposed to happen");
        }
        //challenge
        double firstNum = 20.00d;
        double secondNum = 80.00d;

        double resultOfExpression = (firstNum + secondNum) * 100.00d;

        double remainderExpression = resultOfExpression % 40;

        boolean checkForRemainder = remainderExpression == 0? true : false;

        System.out.println(checkForRemainder);

        if (!checkForRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
