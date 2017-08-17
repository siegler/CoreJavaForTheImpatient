package Ch7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
/*
Implement a method public static void swap(List<?> list, int i, int j) that swaps elements in the usual way when the type of list implements the RandomAccess interface, and that minimizes the cost of visiting the positions at index i and j if it is not.
 */
public class Ex5 {
    public static void swap(List<?> list, int i, int j) {
        if (list instanceof RandomAccess) {
            swapHelper(list, i, j);
        } else {
            nonRandomSwapHelper(list, i, j);
        }
    }
    private static <T> void swapHelper(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    private static <T> void nonRandomSwapHelper(List<T> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        swap(digits, 1, 2);
        System.out.println(digits);

        List<Integer> primes = new LinkedList<>();
        primes.add(1);
        primes.add(2);
        primes.add(3);
        swap(primes, 1, 2);
        System.out.println(primes);
    }
}
