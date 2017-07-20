package Ch5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/*
Write a method public double sumOfValues(String filename) throws ... that calls the preceding method and returns the sum of the values in the file. Propagate any exceptions to the caller.
 */
public class Ex2 {
    public double sumOfValues(String filename) throws IOException {
        ArrayList<Double> doubles;
        doubles = new Ex1().readValues(filename);
        double sum = 0;
        for (double d: doubles) {
            sum += d;
        }
        return sum;
    }
    public static void main(String[] args) throws Throwable {
        double sum = new Ex2().sumOfValues("doubles.txt");
        System.out.println(sum);
    }
}
