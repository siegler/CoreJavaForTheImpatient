package Ch2;

import org.omg.CORBA.IntHolder;
/*
write a method that swaps the contents of two IntHolder objects. (Look up this rather obscure class in the API documentation.)
 */
public class Ex4 {
    private static void swap(IntHolder x, IntHolder y) {
        int val = x.value;
        x.value = y.value;
        y.value = val;
    }

    public static void main(String[] args) {
       IntHolder x = new IntHolder(3);
       IntHolder y = new IntHolder(99);
       swap(x, y);
        System.out.println(x.value);
    }
}
