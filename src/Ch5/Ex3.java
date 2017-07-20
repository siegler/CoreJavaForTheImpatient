package Ch5;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
Write a program that calls the preceding method and prints the result. Catch the exceptions and provide feedback to the user about any error conditions.
 */
public class Ex3 {
    public static void main(String[] args) {
        try {
            double sum = new Ex2().sumOfValues("doubles.txt");
            System.out.printf("Sum of doubles in file is %.2f\n", sum);
        } catch (FileNotFoundException e) {
            System.err.printf("File not found: %s\n", e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
