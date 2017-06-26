package Ch1;

import java.util.Scanner;

/*
Write a program that reads a string and prints all of its nonempty substrings.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        for (String s: line.split("\\s+")) {
            System.out.println(s);
        }
    }
}
