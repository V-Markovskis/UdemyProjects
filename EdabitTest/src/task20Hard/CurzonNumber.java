package task20Hard;

import java.math.BigInteger;

public class CurzonNumber {
    public static void main(String[] args) {
        System.out.println(Challenge.isCurzon(5));
        System.out.println(Challenge.isCurzon(10));
        System.out.println(Challenge.isCurzon(14));
        System.out.println("=============================================================");

        System.out.println(Challenge.isCurzon(90));
    }
}

class Challenge {
    public static boolean isCurzon(int n) {
        BigInteger firstNum = BigInteger.valueOf(2).pow(n).add(BigInteger.valueOf(1));
        BigInteger secondNum = BigInteger.valueOf(2).multiply(BigInteger.valueOf(n)).add(BigInteger.valueOf(1));

        System.out.println(firstNum.mod(secondNum));

        if(firstNum.mod(secondNum).equals(BigInteger.ZERO)) {
            return true;
        } else {
            return false;
        }

    }
}
