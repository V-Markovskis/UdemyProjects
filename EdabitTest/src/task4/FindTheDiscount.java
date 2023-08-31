package task4;

import java.text.DecimalFormat;

public class FindTheDiscount {
    public static void main(String[] args) {
        System.out.println(Sales.discount(1500, 50));
        System.out.println(Sales.discount(89, 20));
        System.out.println(Sales.discount(100, 75));
    }
}
class Sales {
    public static double discount(int price, int percentage) {
//        double result = price - ((double)price * (double) percentage / 100);
//        return result;


        return price-percentage/100.0*price;
    }
}
