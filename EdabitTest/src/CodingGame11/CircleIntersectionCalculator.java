package CodingGame11;

import java.math.BigInteger;

public class CircleIntersectionCalculator {
    public static void main(String[] args) {
        int numberOfCircles = 3;
        int intersectionPoints = calculateIntersectionPoints(numberOfCircles);
        System.out.println("Number of intersection points: " + intersectionPoints);
    }

    // Функция для вычисления факториала
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Функция для вычисления сочетания C(n, k)
    public static BigInteger combination(int n, int k) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(k).multiply(factorial(n - k));
        return numerator.divide(denominator);
    }

    // Функция для вычисления количества точек пересечения
    public static int calculateIntersectionPoints(int numberOfCircles) {
        BigInteger combinations = combination(numberOfCircles, 2);
        return combinations.intValue() * 2;
    }
}