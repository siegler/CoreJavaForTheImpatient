package Ch7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
In an array list of strings, make each string uppercase. Do this with (a) an iterator, (b) a loop over the index values,
and (c) the replaceAll method.
 */
public class Ex2 {
    public static List<String> toUpperWithIterator(List<String> strings) {
        List<String> result = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().toUpperCase());
        }
        return result;
    }
    public static List<String> toUpperWithLoop(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            result.add(s.toUpperCase());
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> stooges = new ArrayList<>();
        stooges.add("Moe");
        stooges.add("Curly");
        stooges.add("Shemp");
        List<String> result = toUpperWithIterator(stooges);
        System.out.println(result);

        result = toUpperWithLoop(stooges);
        System.out.println(result);

        stooges.replaceAll(s -> s.toUpperCase());
        System.out.println(stooges);
    }
}
