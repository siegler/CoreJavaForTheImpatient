package Ch1;

import java.math.BigInteger;
/*
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using BigInteger. Compute the factorial of 1000.
 */
public class Ex6 {
    public static BigInteger factorial(int n) {
        if (n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }
}
