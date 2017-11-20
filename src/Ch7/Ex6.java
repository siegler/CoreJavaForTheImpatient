package Ch7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex6 {
    public static void main(String[] args) {
        Map<String,Set<Integer>> toc = new HashMap<>();
        HashSet<Integer> pages = new HashSet<>();
        pages.add(1);
        pages.add(2);
        pages.add(3);
        pages.add(4);
        toc.put("Chapter One",pages);
    }
}
