package Ch6;

import java.util.Arrays;
/*
Implement a generic method that appends all elements from one array list to another. Use a wildcard for one of the type
arguments. Provide two equivalent solutions, one with a ? extends E wildcard and one with ? super E.
 */
public class Ex6 {
    public static <E> E[] appendArray(E[] array1, E[] array2) {
        E[] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2,0,result,array1.length,array2.length);
        return result;
    }
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {7,8,9};
        System.out.println(Arrays.toString(appendArray(array1,array2)));
    }
}
