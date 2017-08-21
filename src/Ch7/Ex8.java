package Ch7;

import java.io.File;
import java.util.*;
/*
Write a program that reads all words in a file and prints out on which line(s) each of them occurred. Use a map from strings to sets.
 */
public class Ex8 {
    public static void main(String[] args) throws Throwable {
        Map<String,Set<Integer>> words = new HashMap<>();
        Scanner scanner = new Scanner(new File("words.txt"));
        int lineno = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (String word: line.split("\\W+")) {
                word = word.toUpperCase();
                if (!words.containsKey(word)) {
                    Set<Integer> lines = new TreeSet<>();
                    lines.add(lineno);
                    words.put(word, lines);
                } else {
                    words.get(word).add(lineno);
                }
            }
            lineno++;
        }
        //print out words and lines
        words.forEach((k,v) -> {
            System.out.println("word: " + k);
            String sep = "";
            for (int line: v) {
                System.out.printf("%s%d",sep,line);
                sep = ", ";
            }
            System.out.println();
        });
    }
}
