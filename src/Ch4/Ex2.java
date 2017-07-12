package Ch4;
/*
Define toString, equals, and hashCode methods for the classes of the preceding exercise.
 */
public class Ex2 {
    public static void main(String[] args) {
        LabeledPoint point1 = new LabeledPoint("One", 3, 9);
        LabeledPoint point2 = new LabeledPoint("One", 3, 9);
        LabeledPoint point3 = new LabeledPoint("Two", 3, 9);

        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point1));

        System.out.println(point3.equals(point2));
    }
}
