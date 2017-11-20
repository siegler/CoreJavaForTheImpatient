package Ch1;

import java.util.Scanner;

/*
    Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
    0 and 359 degrees. Try it first with the % operator, then with floorMod.
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angle = scanner.nextInt();
        int normalAngle = (angle % 360 + 360) % 360;
        System.out.println(normalAngle);

        int normalAngle2 = Math.floorMod(angle, 360);
        System.out.println(normalAngle2);
    }
}
