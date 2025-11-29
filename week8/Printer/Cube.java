package week8.Printer;

public class Cube extends Cuboid{
    public Cube(double x, double y, double z, double side){
        super(x, y, z, side, side, side);
    }

    @Override
    public String toString(){
        return String.format("Kubus met zijde %.1f op plaats (%.1f, %.1f, %.1f) en volume %.2f", this.getWidth(), this.getX(), this.getY(), this.getZ(), this.volume());
    }

}
