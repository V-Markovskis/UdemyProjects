package task3;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Challenge.fizzBuzz(3));
        System.out.println(Challenge.fizzBuzz(5));
        System.out.println(Challenge.fizzBuzz(15));
        System.out.println(Challenge.fizzBuzz(4));

    }
}

class Challenge {
    public static String fizzBuzz(int n) {
        String result = (n % 3 == 0 && n % 5 == 0) ? "FizzBuzz" :  n % 3 == 0 ? "Fizz" : n % 5 == 0 ? "Buzz" : String.valueOf(n);
        return result;
    }
}


