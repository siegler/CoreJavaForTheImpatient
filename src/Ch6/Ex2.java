package Ch6;

import java.util.Arrays;
/*
Reimplement the Stack<E> class, using an array to hold the elements. If necessary, grow the array in the push method.
Provide two solutions, one with an E[] array and one with an Object[] array. Both solutions should compile without
warnings. Which do you prefer, and why?
 */
class Ex2Stack<E> {
    private E[] stack = (E[]) new Object[1];
    private int idx = 0;
    public void push(E e) {
        if (stack.length == idx) {
            growArray();
        }
        stack[idx++] = e;
    }

    private void growArray() {
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    public E pop() {
        return stack[--idx];
    }
}
class Ex2StackWithObject {
    private Object[] stack = new Object[1];
    private int idx = 0;
    public void push(Object e) {
        if (stack.length == idx) {
            growArray();
        }
        stack[idx++] = e;
    }

    private void growArray() {
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    public Object pop() {
        return stack[--idx];
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Ex2Stack<String> example = new Ex2Stack<>();
        example.push("Moe");
        example.push("Curly");
        example.push("Shemp");
        System.out.println(example.pop());
        System.out.println(example.pop());
        String s = example.pop();

        Ex2StackWithObject example2 = new Ex2StackWithObject();
        example2.push("Moe");
        example2.push("Curly");
        example2.push("Shemp");
        example2.push(1); //no type checking
//        String ss = example2.pop(); // incompatible types
    }
}
