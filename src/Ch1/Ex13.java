package Ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49. To pick six distinct numbers, start with an array list filled with 1 . . . 49. Pick a random index and remove the element. Repeat six times. Print the result in sorted order.
 */

public class Ex13 {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        int[] picks = new int[6];
        Random random = new Random();

        for (int i = 0; i < 49; i++) {
            lottery.add(i+1);
        }

        for (int i = 0; i < 6; i++) {
            int pick = random.nextInt(lottery.size());
            picks[i] = lottery.remove(pick);
        }

        Arrays.sort(picks);

        System.out.println(Arrays.toString(picks));
    }
}
