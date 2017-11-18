package Ch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
Verify that asking for the first five long words does not call the filter method once the fifth long word has been
found. Simply log each method call.
 */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        Object[] result = words.stream()
                .peek(System.out::println)
                .filter(w -> w.length() > 2)
                .limit(5)
                .toArray();
    }
}
