package task11;

public class ManyOperators {
    public static void main(String[] args) {
        System.out.println(ArithmeticOps.operate(1, 2, "+"));
    }
}

class ArithmeticOps {
    public static int operate(int num1, int num2, String operator) {
        switch(operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            default:
                return 0;
        }
    }
}
