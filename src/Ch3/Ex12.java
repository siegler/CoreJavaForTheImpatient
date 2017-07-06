package Ch3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
/*
Given an array of File objects, sort it so that directories come before files, and within each group, elements are sorted by path name. Use a lambda expression to specify the Comparator.
 */
public class Ex12 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] paths = dir.listFiles();
        Arrays.sort(paths, Comparator
                .comparing(File::isFile)
                .thenComparing(File::getName));
        for (File path: paths) {
            System.out.println(path);
        }
    }
}
