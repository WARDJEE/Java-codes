package week9.EenMooiFiguur;

public class Rectangle extends Figure implements HasBorder, HasSurface{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double circumference() {
        return (this.width + this.length)*2;
    }

    @Override
    public double area() {
        return this.width * this.length;
    }
}
