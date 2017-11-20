package Ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/*
 Implement the method void luckySort(ArrayList<String> strings, Comparator<String> comp) that keeps calling
 Collections.shuffle on the array list until the elements are in increasing order, as determined by the comparator.
 */
public class Ex7 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        ArrayList<String> tmp = new ArrayList<>(strings);
        Collections.sort(tmp, comp);
        while (!strings.equals(tmp)) {
            Collections.shuffle(strings);
        }

    }
    public static void main(String[] args) {
        ArrayList<String> stooges = new ArrayList<>();
        stooges.add("moe");
        stooges.add("Curly");
        stooges.add("Schemp");
        luckySort(stooges, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
}
