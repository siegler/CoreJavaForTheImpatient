package Ch3;
/*
Implement a static of method of the IntSequence class that yields a sequence with the arguments. For example,
IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with six values. Extra credit if you return an instance of an
anonymous inner class.
 */
public class Ex4 {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
