package Ch4;

/**
 * Define a class Point with a constructor public Point(double x, double y) and accessor methods getX, getY. Define a subclass LabeledPoint with a constructor public LabeledPoint(String label, double x, double y) and an accessor method getLabel.
 */
public class Ex1 {
    public static void main(String[] args) {
        Point point = new Point(3,44);
        System.out.println(point);

        LabeledPoint origin = new LabeledPoint("Origin", 0, 0);
        System.out.println(origin);
    }
}
