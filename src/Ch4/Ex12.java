package Ch4;

import java.lang.reflect.Method;
/*
Measure the performance difference between a regular method call and a method call via reflection.

Used https://stackoverflow.com/questions/19557829/faster-alternatives-to-javas-reflection
 */
public class Ex12 {
    private static final int ITERATIONS = 5_000_000;
    private static int myMin(int x, int y) {
        return x < y ? x: y;
    }
    private static int testDirect(int v) {
        int result = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            result += myMin(1000, v);
        }
        return result;
    }
    private static int testReflection(int v, Method m) throws Throwable {
        int result = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            result += (int) m.invoke(null, 1000, v);
        }
        return result;
    }
    public static void main(String[] args) throws Throwable {
        long t1 = System.currentTimeMillis();
        testDirect(1);
        long t2 = System.currentTimeMillis();
        System.out.println("Direct invocation: " + (t2-t1) + "ms");

        long t3 = System.currentTimeMillis();
        Method m = Ex12.class.getDeclaredMethod("myMin", int.class, int.class);
        testReflection(1000, m);
        long t4 = System.currentTimeMillis();
        System.out.println("Invocation by reflection: " + (t4-t3) + "ms");


    }
}
