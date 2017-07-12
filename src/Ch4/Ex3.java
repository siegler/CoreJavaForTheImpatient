package Ch4;
/*
Make the instance variables x and y of the Point class in Exercise 1 protected. Show that the LabeledPoint class can access these variables only in LabeledPoint instances.
 */
public class Ex3 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("Saturn", 3.4, 4.9);
        System.out.println(labeledPoint.x);
    }
}
