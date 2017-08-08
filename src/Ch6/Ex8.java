package Ch6;

public class Ex8 {
    class Pair<E extends Comparable<E>> {
        private E first, second;
        public Pair(E first, E second) {
            this.first = first;
            this.second = second;
        }
        public E getFirst() {
            return first;
        }
        public E getSecond() {
            return second;
        }
        public E max() {
            return first.compareTo(second) < 0 ? second: first;
        }
        public E min() {
            return first.compareTo(second) < 0 ? first: second;
        }
    }
    public static void main(String[] args) {
        Pair<String> stooges = new Ex8().new Pair("Moe","Curly");
        System.out.println(stooges.max());
        System.out.println(stooges.min());
    }
}
