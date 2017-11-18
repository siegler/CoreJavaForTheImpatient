package Ch8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Suppose you have an array int[] values = { 1, 4, 9, 16 } .
What is Stream.of(values)? How do you get a stream of
int instead?
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        Stream<int[]> digits = Stream.of(values); //get stream of integer arrays
        IntStream result = Arrays.stream(values);
    }
}
