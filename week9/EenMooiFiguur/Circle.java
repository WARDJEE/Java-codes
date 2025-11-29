package week9.EenMooiFiguur;

public class Circle extends Figure implements HasBorder, HasSurface{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double circumference() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double area() {
        return this.radius*this.radius*Math.PI;
    }
}
