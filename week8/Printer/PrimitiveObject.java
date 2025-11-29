package week8.Printer;

public class PrimitiveObject {
    private double[] position = new double[3];

    public PrimitiveObject(double x, double y, double z){
        this.position[0] = x;
        this.position[1] = y;
        this.position[2] = z;
    }

    public PrimitiveObject(){
        this(0, 0, 0);
    }

    public double getX(){
        return this.position[0];
    }

    public double getY(){
        return this.position[1];
    }

    public double getZ(){
        return this.position[2];
    }

    public double volume(){
        return 0;
    }

    public String toString(){
        return String.format("(%.1f, %.1f, %.1f) en volume %.2f", getX(), getY(), getZ(), volume());
    }
}
