package Ch1;
/*
    Write a program that prints the smallest and largest positive double value. Hint: Look up Math.nextUp in the Java API.
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.printf("Smallest positive double value is %g, and largest double value is %g\n", Math.nextUp(0.0), Double.MAX_VALUE);
    }
}
