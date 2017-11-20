package Ch2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
Implement an immutable class Point that describes a point in the plane. Provide a constructor to set it to a specific
point, a no-arg constructor to set it to the origin, and methods getX, getY, translate, and scale. The translate method
moves the point by a given amount in x- and y-direction. The scale method scales both coordinates by a given factor.
Implement these methods so that they return new points with the results.
 */

public class Ex5 {
    /**
     * A <code>Point</code> object represents a point in the plane
     * @author Chris
     * @version 0.1
     */
    public class Point {
        private double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        Point() {
            this(0,0);
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }

        /**
         * Translates the point by given amount in the x & y directions
         * @param dx
         * @param dy
         * @return Point
         */
        public Point translate(double dx, double dy) {
            return new Point(x + dx, y + dy);
        }

        /**
         * Scales the point by the given factor
         * @param d
         * @return Point
         */
        public Point scale(double d) {
            return new Point(x * d, y * d);
        }

        @Override
        public String toString() {
            DecimalFormat df = new DecimalFormat("#.##");
            String x = df.format(getX());
            String y = df.format(getY());
            return "(" + x + ", " + y + ")";
        }
    }
    public static void main(String[] args) {
        Ex5 ex = new Ex5();
        Ex5.Point p = ex.new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(p);
    }
}
