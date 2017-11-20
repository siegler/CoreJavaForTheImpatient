package Ch7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Do the same without the merge method, (a) by using contains, (b) by using get and a null check, (c) by using
getOrDefault, (d) by using putIfAbsent.
 */
public class Ex9 {
    public static void printMap(Map map) {
        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }
    public static void main(String[] args) {
        String words = "one two three one two one";
        Map<String, Integer> counts = new HashMap<>();

        //with contains
        for (String word: words.split(" ")) {
            if (counts.containsKey(word)) {
                int count = counts.get(word);
                counts.put(word, ++count);
            } else {
                counts.put(word, 1);
            }
        }

        printMap(counts);

        counts.clear();

        //by using get and a null check
        for (String word: words.split(" ")) {
            if (counts.get(word) == null) {
                counts.put(word, 1);
            } else {
                int count = counts.get(word);
                counts.put(word, ++count);
            }
        }

        printMap(counts);

        counts.clear();

        //by using getOrDefault
        for (String word: words.split(" ")) {
            int count = counts.getOrDefault(word, 0);
            counts.put(word, ++count);
        }

        printMap(counts);

        counts.clear();
        //by using putIfAbsent
        for (String word: words.split(" ")) {
            counts.putIfAbsent(word, 0);
            int count = counts.get(word);
            counts.put(word, ++count);
        }

        printMap(counts);

    }
}
