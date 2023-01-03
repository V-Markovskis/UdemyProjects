package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double numForFirst) {
        this.firstNumber = numForFirst;
    }

    public void setSecondNumber(double numForSecond) {
        this.secondNumber = numForSecond;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
