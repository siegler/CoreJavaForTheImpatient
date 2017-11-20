package Ch3;

import java.util.Arrays;
import java.util.Random;

/*
Implement the RandomSequence in Section 3.9.1, “Local Classes,” on p. 122 as a nested class, outside the randomInts
method.
 */
public class Ex15 {
    public class LotterySequence implements IntSequence {
        private Random generator =  new Random();
        private int low, high;
        LotterySequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }
    }

    public static IntSequence randomInts(int low, int high) {
        return new Ex15().new LotterySequence(low, high);
    }
    public static void main(String[] args) {
        IntSequence lottery = randomInts(1, 69);
        int[] ticket = new int[6];
        for (int i = 0; i < 5; i++) {
            ticket[i] = lottery.next();
        }
        Arrays.sort(ticket, 0, 4);

        ticket[5] = randomInts(1,29).next(); //PowerBall

        System.out.println(Arrays.toString(ticket));
    }
}
