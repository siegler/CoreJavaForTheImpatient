package Ch8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
Measure the difference when counting long words with a parallelStream
instead of a stream . Call System.currentTimeMillis before and after the call and
print the difference. Switch to a larger document (such as War and Peace)
if you have a fast computer.
 */
public class Ex2 {
    public static void main(String[] args) throws Throwable {
        String contents = new String(Files.readAllBytes(Paths.get("war and peace.txt")));
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long start = System.currentTimeMillis();
        long n = words.stream()
                .filter(w -> w.length() > 12)
                .count();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");

        start = System.currentTimeMillis();
        n = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();
        end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
