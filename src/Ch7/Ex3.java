package Ch7;

import java.util.HashSet;
import java.util.Set;

/*
How do you compute the union, intersection, and difference of two sets, using just the methods of the Set interface and without using loops?
 */
public class Ex3 {
    public static <T> Set<T> union(final Set<T> one, final Set<T> two) {
        Set<T> result = new HashSet<T>(one);
        result.addAll(two);
        return result;
    }
    public static <T> Set<T> intersection(final Set<T> one, final Set<T> two) {
        Set<T> result = new HashSet<T>(one);
        result.retainAll(two);
        return result;
    }
    public static <T> Set<T> difference(final Set<T> one, final Set<T> two) {
        Set<T> result = new HashSet<T>(two);
        result.addAll(two);
        result.removeAll(intersection(one, two));
        return result;
    }
    public static void main(String[] args) {
        Set<String> stooges = new HashSet<>();
        stooges.add("Moe");
        stooges.add("Curly");
        stooges.add("Larry");

        Set<String> allStooges = new HashSet<>();
        allStooges.add("Moe");
        allStooges.add("Larry");
        allStooges.add("Shemp");
        allStooges.add("Curly");
        allStooges.add("Curly Joe");

        System.out.println(union(stooges, allStooges));
        System.out.println(intersection(stooges, allStooges));
        System.out.println(difference(stooges, allStooges));
    }
}
