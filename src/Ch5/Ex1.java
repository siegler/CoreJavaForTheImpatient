package Ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public ArrayList<Double> readValues(String filename) throws IllegalArgumentException, FileNotFoundException {
        ArrayList<Double> result = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException(String.format("File not found: %s", filename));
        }
        Scanner scanner = new Scanner(file);
        String s = "";
        double d;
        while (scanner.hasNext()) {
            try {
                s = scanner.next();
                d = Double.parseDouble(s);
                result.add(d);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(String.format("Not a double: %s",s));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex1 example = new Ex1();
        try {
            ArrayList<Double> doubles = example.readValues("doubles.txt");
            System.out.println(doubles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
