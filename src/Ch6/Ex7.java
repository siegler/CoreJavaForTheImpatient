package Ch6;
/*
Implement a class Pair<E> that stores a pair of elements of type E. Provide accessors to get the first and second element.
 */
public class Ex7 {
    class Pair<E> {
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
    }
    public static void main(String[] args) {
        Pair<String> stooges = new Ex7().new Pair("Moe","Curly");
        System.out.println(stooges.getSecond());
    }
}
