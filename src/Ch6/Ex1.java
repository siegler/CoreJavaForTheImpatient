package Ch6;

import java.util.ArrayList;
/*
Implement a class Stack<E> that manages an array list of elements of type E. Provide methods push, pop, and isEmpty.
 */
class Ex1Stack<E> {
    private ArrayList<E> stack = new ArrayList<E>();
    public void push(E e) {
        stack.add(0, e);
    }
    public E pop() {
        return stack.remove(0);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Ex1Stack<Integer> stack = new Ex1Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
