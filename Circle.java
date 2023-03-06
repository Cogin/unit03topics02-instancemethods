import java.lang.reflect.Constructor;

public class Circle {
    private Point2D center;
    public double radius;

    public Circle(Point2D center, double radius){
        this.center = center;
        this.radius= radius;
    }

    public Point2D getCenter() {
        return center;
    } 

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean intersects(Circle other) {
        double distance = center.distanceTo(other.center);
        return distance < radius + other.radius;
    }

}
