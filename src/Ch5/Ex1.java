package Ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Write a method public ArrayList<Double> readValues(String filename) throws ... that reads a file containing
floating-point numbers. Throw appropriate exceptions if the file could not be opened or if some of the inputs are not
floating-point numbers.
 */
public class Ex1 {
    public ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> result = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException(filename);
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextDouble()) {
                result.add(scanner.nextDouble());
            }
        }
        return result;
    }

    public static void main(String[] args) throws Throwable {
        Ex1 example = new Ex1();
        ArrayList<Double> doubles = example.readValues("doubles.txt");
        System.out.println(doubles);
    }
}
