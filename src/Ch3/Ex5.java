package Ch3;
/*
Implement a static constant method of the IntSequence class that yields an infinite constant sequence. For example,
IntSequence.constant(1) yields values 1 1 1 . . . , ad infinitum. Extra credit if you do this with a lambda expression.
 */
public class Ex5 {
    public static void main(String[] args) {
        IntSequence constant = IntSequence.constant(1);
        for (int i = 0; i < 10 && constant.hasNext(); i++) {
            System.out.println(constant.next());
        }
    }
}
