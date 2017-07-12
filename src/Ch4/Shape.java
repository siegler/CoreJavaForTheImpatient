package Ch4;

public abstract class Shape {
    protected Point point;
    public Shape(Point point) {
        this.point = point;
    }
    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }
    abstract public Point getCenter();
}
