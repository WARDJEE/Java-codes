package week8.Printer;

public class Cylinder extends PrimitiveObject{
    private double radius;
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height){
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double volume(){
        return Math.PI*Math.pow(this.radius, 2)*this.height;
    }

    @Override
    public String toString(){
        return String.format("Cilinder met straal %.1f en hoogte %.1f op plaats %s", this.radius, this.height,super.toString());
    }
}
