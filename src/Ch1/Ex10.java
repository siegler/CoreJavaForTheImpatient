package Ch1;

import java.util.Random;
/*
Write a program that produces a random string of letters and digits by generating a random long value and printing it in base 36.
 */
public class Ex10 {
    public static void main(String[] args) {
        Random generator = new Random();
        long l = generator.nextLong();
        String random = Long.toUnsignedString(l, 36);
        System.out.println("Random string of letters and digits: " + random.toUpperCase());
    }
}
