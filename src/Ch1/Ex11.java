package Ch1;

import java.util.Scanner;

/*
Write a program that reads a line of text and prints all characters that are not ASCII, together with their Unicode values.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int[] codePoints = line.codePoints().toArray();
        for (int codepoint: codePoints) {
            if (codepoint > 127) {
                System.out.printf("%c : %X\n", codepoint, codepoint);
            }
        }
    }
}
