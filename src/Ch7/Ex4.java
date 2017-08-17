package Ch7;

import java.util.*;
/*
Produce a situation that yields a ConcurrentModificationException. What can you do to avoid it?
 */
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        ListIterator<Integer> iter1 = numbers.listIterator();
        ListIterator<Integer> iter2 = numbers.listIterator();
        iter1.add(1);
        try {
            int i = iter2.next();
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException");
        }
    }
}
