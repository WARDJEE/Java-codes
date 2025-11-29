package week9.VirtualReality;

public abstract class Entity {
    protected String name;
    protected double[] position;

    public Entity(String name, double[] position) {
        if (position.length > 3){
            System.out.println("Max 3 elementen (x, y, z)!");
            this.position = new double[]{0.0, 0.0, 0.0};
        }
        this.name = name;
        this.position = position;
    }

    public String toString(){
        return String.format("%s (%.1f, %.1f, %.1f)", this.name, this.position[0], this.position[1], this.position[2]);
    }
}
