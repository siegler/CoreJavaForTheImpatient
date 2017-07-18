package Ch5;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ex2 {
    public double sumOfValues(String filename) throws IllegalArgumentException, FileNotFoundException {
        ArrayList<Double> doubles;
        doubles = new Ex1().readValues(filename);
        double sum = 0;
        for (double d: doubles) {
            sum += d;
        }
        return sum;
    }
    public static void main(String[] args) {
        try {
            double sum = new Ex2().sumOfValues("doubles.txt");
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
