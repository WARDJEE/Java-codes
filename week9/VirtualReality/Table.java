package week9.VirtualReality;

public class Table extends Entity implements Visible, Movable{
    public Table(String name, double[] position){
        super(name, position);
    }

    @Override
    public void draw() {
        System.out.println("Table: " + super.toString());
    }

    @Override
    public void move(double[] position) {
        if (position.length > 3){
            System.out.println("Max 3 elementen (x, y, z)!");
            position = new double[]{0.0, 0.0, 0.0};
        }

        super.position[0] += position[0];
        super.position[1] += position[1];
        super.position[2] += position[2];
    }
}
