package week9.EenMooiFiguur;

public class Sphere extends Figure implements HasVolume{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double volume(){
        return 4.0/3.0 * Math.PI * Math.pow(this.radius, 3);
    }
}
