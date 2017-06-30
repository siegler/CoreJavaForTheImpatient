package Ch3;

public interface IntSequence {
    default boolean hasNext() {
        return false;
    }
    int next();
    public static IntSequence of(int... numbers) {
        return new IntSequence() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < numbers.length;
            }

            @Override
            public int next() {
                return numbers[i++];
            }
        };
    }
    public static IntSequence constant(int n) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return n;
            }
        };
    }
}
