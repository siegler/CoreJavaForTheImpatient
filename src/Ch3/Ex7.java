package Ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex7 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> tmp = new ArrayList<>(strings);
        Collections.sort(tmp, comp);
        while (!strings.equals(tmp)) {
            Collections.shuffle(strings);
        }

    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("moe");
        strings.add("Curly");
        strings.add("Schemp");
        luckySort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
}
