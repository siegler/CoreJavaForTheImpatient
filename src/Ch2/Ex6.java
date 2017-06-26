package Ch2;

import java.text.DecimalFormat;
/*
Repeat the preceding exercise, but now make translate and scale into mutators.
 */
public class Ex6 {
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
        public Point translate(double dx, double dy) {
            x += dx;
            y += dy;
            return this;
        }
        public Point scale(double d) {
            x *= d;
            y *= d;
            return this;
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
        Ex6 ex = new Ex6();
        Ex6.Point p = ex.new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(p);
    }
}
