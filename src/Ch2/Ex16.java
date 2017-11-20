package Ch2;

/*
Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the tail, and remove, removing at
the head of the queue. Store elements as a linked list of nodes. Make Node a nested class. Should it be static or not?
 */
public class Ex16 {
    private Node head;

    private class Node {
        Node next;
        String s;
        Node(String s) {
            this.s = s;
        }
    }
    public void add(String s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public Node remove() {
        if (head == null) {
            return null;
        }
        Node result = head;
        head = head.next;
        return result;
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.println(n.s);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Ex16 queue = new Ex16();
        queue.add("Larry");
        queue.add("Moe");
        queue.add("Curly");
        queue.remove();
        queue.add("Shemp");
        queue.print();
    }
}
