package week8.Printer;

public class Sphere extends PrimitiveObject{
    private double radius;

    public Sphere(double x, double y, double z, double radius){
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double volume(){
        return (4.0/3.0)*Math.PI*Math.pow(this.radius, 3);
    }

    @Override
    public String toString(){
        return String.format("Bol met straal %.1f op plaats %s", this.radius, super.toString());
    }
}
