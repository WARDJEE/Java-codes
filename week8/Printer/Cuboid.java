package week8.Printer;

public class Cuboid extends PrimitiveObject{
    private double[] size = new double[3];

    public Cuboid(double x, double y, double z, double width, double height, double depth){
        super(x, y, z);
        this.size[0] = width;
        this.size[1] = height;
        this.size[2] = depth;

    }

    public double getWidth(){
        return this.size[0];
    }

    public double getHeight(){
        return this.size[1];
    }

    public double getDepth(){
        return this.size[2];
    }

    @Override
    public double volume(){
        return this.getWidth() * this.getHeight() * this.getDepth();
    }

    @Override
    public String toString() {
        return String.format("Balk met afmetingen (%.1f, %.1f, %.1f) op plaats %s", this.getWidth(), this.getHeight(), this.getDepth(), super.toString());
    }
}
