package Ch5;

import java.io.FileNotFoundException;

public class Ex3 {
    public static void main(String[] args) {
        try {
            double sum = new Ex2().sumOfValues("doubles.txt");
            System.out.printf("Sum of doubles in file is %.2f\n", sum);
        } catch (FileNotFoundException e) {
            System.err.printf("File not found: %s\n", e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.printf("File contained a value that wasn't a double: %s", e.getMessage());
        }
    }
}
