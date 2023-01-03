public class NumSumRecap {
    public int numSumRecap(int number1, int number2, int number3) {
        if(number1 >= number3 && number2 >= number3) {
            return number1 + number2;
        } else if (number2 >= number1 && number3 >= number1) {
            return number2 + number3;
        } else {
            return number1 + number3;
        }
    }
}
