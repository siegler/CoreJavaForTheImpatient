package Ch7;

import Ch3.IntSequence;

import java.util.*;
/*
Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers ≤ n. Add all numbers from 2 to n to a
set. Then repeatedly find the smallest element s in the set, and remove s2, s · (s + 1), s · (s + 2), and so on. You are
done when s2 > n. Do this with both a HashSet<Integer> and a BitSet.
 */
public class Ex1 {
    public static List<Integer> sieve(int n) {
        BitSet A = new BitSet(n);
        for (int i = 0; i < n; i++) {
            A.set(i, true);
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (A.get(i)) {
                for (int j = i * i, k = 0; j <= n; k++, j = (i * i)+(k * i)) {
                    A.set(j, false);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (A.get(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static Set<Integer> sieveWithHash(int n) {
        Set<Integer> result = new HashSet<>();
        for (int i = 2; i < n; i++) {
            result.add(i);
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (result.contains(i)) {
                for (int j = i * i, k = 0; j <= n; k++, j = (i * i)+(k * i)) {
                    result.remove(j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sieve(100));
        System.out.println(sieveWithHash(100));
    }
}
