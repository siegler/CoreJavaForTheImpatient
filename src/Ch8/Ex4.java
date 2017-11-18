package Ch8;

import java.util.stream.Stream;

/*
Using Stream.iterate , make an infinite stream of random numbers—not by
calling Math.random but by directly implementing a linear congruential generator.
In such a generator, you start with x 0 = seed and then produce x n + 1 = (a
x n + c) % m, for appropriate values of a, c, and m. You should implement
a method with parameters a , c , m , and seed that yields a Stream<Long> . Try
out a = 25214903917, c = 11, and m = 2 48 .
 */
public class Ex4 {
    public static Stream<Long> generateLongStream(long a, long c, long m) {
        long x0 = System.currentTimeMillis();
        Stream<Long> result = Stream.iterate(x0, n -> ((a*n)+c)%m).skip(1);
        return result;
    }
    public static void main(String[] args) {
        Stream<Long> rands = generateLongStream(25214903917L, 11L, (long)Math.pow(2, 48));
        Long[] result = rands.limit(1).toArray(Long[]::new);
        System.out.println(result[0]);
    }
}
