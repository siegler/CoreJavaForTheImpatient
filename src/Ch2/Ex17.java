package Ch2;

import java.util.Iterator;

public class Ex17 {
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

    public Iterator<Node> iterator() {
        return new NodeIterator();
    }

    public class NodeIterator implements Iterator<Node> {
        Node h;
        NodeIterator() {
            h = head;
        }
        @Override
        public boolean hasNext() {
            return h != null;
        }

        @Override
        public Node next() {
            Node result = h;
            h = h.next;
            return result;
        }
    }


    public static void main(String[] args) {
        Ex17 queue = new Ex17();
        queue.add("Larry");
        queue.add("Moe");
        queue.add("Curly");
        queue.remove();
        queue.add("Shemp");

        Iterator<Node> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Node n = iterator.next();
            System.out.println(n.s);
        }
    }
}
