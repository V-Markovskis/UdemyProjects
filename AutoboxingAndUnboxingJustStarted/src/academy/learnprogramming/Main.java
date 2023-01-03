package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = 54;
        Double doubleValue = 12.25;


//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for(int i = 0; i <= 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i = 0; i <= 10; i++) {
//            System.out.println(i + "--> " + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; //At compile time --> Integer.valueOf(56)
        int myInt = myIntValue; //At compile time --> myInt.intValue();
        int myIntSecond = myIntValue.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            doubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i).doubleValue();
            System.out.println(i + " ---> " + value);
        }
    }
}
