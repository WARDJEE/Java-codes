package week9.EenMooiFiguur;

public class Cuboid extends Figure implements HasVolume{
    private Rectangle base;
    private double height;

    public Cuboid(String name, double length, double width, double height) {
        super(name);
        base = new Rectangle(name, length, width);
        this.height = height;
    }

    public double getLength(){
        return this.base.getLength();
    }

    public double getWidth(){
        return this.base.getWidth();

    }

    public double getHeight() {
        return this.height;
    }

    public double volume(){
        return this.base.area()*this.height;
    }
}
