package Ch1;

import java.util.ArrayList;
import java.util.List;
/*
Write a program that stores Pascal’s triangle up to a given n in an ArrayList<ArrayList<Integer>>.
 */

public class Ex15 {
    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();

            l.add(1);

            for (int j = 1; j < i; j++) {
                int x = triangle.get(i-1).get(j-1);
                int y = triangle.get(i-1).get(j);

                l.add(x + y);
            }

            if (i > 0) {
                l.add(1);
            }

            triangle.add(l);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(triangle.get(i));
        }
    }
}
