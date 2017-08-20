package Ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Throwable {
        Map<String, Integer> counts = new HashMap<>();
        Scanner scanner = new Scanner(new File("words.txt"));
        while (scanner.hasNext()) {
            String word = scanner.next();
            counts.merge(word, 1, Integer::sum);
        }

        counts.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
