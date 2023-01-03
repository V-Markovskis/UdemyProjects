public class IntegerSum {
    public int sum (int num1, int num2, int num3) {
        if(num1 >= num3 && num2 >= num3) {
            return num1 + num2;
        } else if (num2 >= num1 && num3 >= num1) {
            return num2 + num3;
        } else {
            return num1 + num3;
        }
    }
}
