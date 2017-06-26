package Ch1;
/*
What happens when you cast a double to an int that is larger than the largest possible int value? Try it out.
 */
public class Ex5 {
    public static void main(String[] args) {
        double d = Integer.MAX_VALUE + 1.0;
        int i = (int) d;

        System.out.println(i == Integer.MAX_VALUE);
    }
}
