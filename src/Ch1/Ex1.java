package Ch1;

import java.util.Scanner;

/*
    Write a program that reads an integer and prints it in binary, octal, and hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String binary = Integer.toString(i, 2);
        System.out.printf("Int %d, Octal %o, Hex %x, Binary %s, Hex Float %a\n", i, i, i, binary, 1.0F / i);
    }
}
