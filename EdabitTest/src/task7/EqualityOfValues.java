package task7;

import java.util.HashSet;

public class EqualityOfValues {
    public static void main(String[] args) {
        //no duplicate values in HashSet
    }
}

class Challenge {
    public static int equal(int a, int b, int c) {
        HashSet<Integer> equals = new HashSet <Integer>();

        equals.add(a);
        equals.add(b);
        equals.add(c);

        if(equals.size() == 1){
            return 3;
        }else if(equals.size() == 2){
            return 2;
        }else{
            return 0;
        }
    }
}
