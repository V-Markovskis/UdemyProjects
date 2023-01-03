package com.jarFile;

public class Series {

    public static int nSum(int n) {
        int count = 0;
        int sumFromZeroToN = 0;
        for(int i = 0; i < n; i++) {
            count++;
            sumFromZeroToN += count;
        }
        return sumFromZeroToN;
    }

    public static long factorial(int n) {
        int count = 0;
        int factorialFromZeroToN = 1;
        for(int i = 0; i < n; i++) {
            count++;
            factorialFromZeroToN *= count;
        }
        return factorialFromZeroToN;
    }

    // Function to find the nth Fibonacci number
    public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
