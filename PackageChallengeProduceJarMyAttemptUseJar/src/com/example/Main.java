package com.example;


import com.jarFile.Series;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("======================");


        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("========================");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fib(i));
        }

        System.out.println("======================");
    }
}