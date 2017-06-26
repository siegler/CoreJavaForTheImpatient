package Ch1;

import java.util.Scanner;
/*
    Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with Math.max.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int largest = x > y ? (x > z ? x: z) : (y > z ? y: z);
        System.out.println(largest);

        largest = Math.max(Math.max(x,y), z);
        System.out.println(largest);
    }
}
