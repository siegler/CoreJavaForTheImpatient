package Ch4;
/*
Define an abstract class Shape with an instance variable of class Point, a constructor, a concrete method public void moveBy(double dx, double dy) that moves the point by the given amount, and an abstract method public Point getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors public Circle(Point center, double radius), public Rectangle(Point topLeft, double width, double height) and public Line(Point from, Point to).
 */
class Circle extends Shape {
    private double radius;
    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }
}

class Rectangle extends Shape {
    double width, height;
    public Rectangle(Point topleft, double width, double height) {
        super(topleft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + (width / 2), point.getY() + (height / 2));
    }

}

class Line extends Shape {
    Point to;
    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX()+to.getX())/2, (point.getY()+to.getY())/2);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(4, 4), 3);
        Rectangle r = new Rectangle(new Point(0, 0), 5, 5);
        Line l = new Line(new Point(-1, 2), new Point(3, -6));
        System.out.println(l.getCenter());
    }
}

