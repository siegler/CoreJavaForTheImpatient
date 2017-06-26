package Ch1;

import java.util.Scanner;

/*
Write a program that reads in two numbers between 0 and 65535, stores them in short variables, and computes their unsigned sum, difference, product, quotient, and remainder, without converting them to int.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short x = (short) scanner.nextInt();
        short y = (short) scanner.nextInt();

        System.out.println("Sum is " + (Short.toUnsignedInt(x) + Short.toUnsignedInt(y)));
        System.out.println("Difference is " + (Short.toUnsignedInt(x) - Short.toUnsignedInt(y)));
        System.out.println("Product is " + (Short.toUnsignedInt(x) * Short.toUnsignedInt(y)));
        System.out.println("Quotient is " + (Short.toUnsignedInt(x) / Short.toUnsignedInt(y)));
        System.out.println("Remainder is " + (Short.toUnsignedInt(x) % Short.toUnsignedInt(y)));
    }
}
