package Ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex10 {
    static class RandomNumbers {
        private static Random generator = new Random();
        public static int randomElement(int[] intArray) {
            if (intArray == null || intArray.length == 0) {
                return 0;
            }
            int i = generator.nextInt(intArray.length);
            return intArray[i];
        }
        public static int randomElement(List<Integer> list) {
            if (list == null || list.isEmpty()) {
                return 0;
            }
            int i = generator.nextInt(list.size());
            return list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] zipCodes = new int[] {55082,90210,12345,10034};
        List<Integer> areaCodes = new ArrayList<>(Arrays.asList(612,651,405,415,702));
        System.out.println(RandomNumbers.randomElement(zipCodes));
        System.out.println(RandomNumbers.randomElement(areaCodes));
    }
}
