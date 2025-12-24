package week12.Voorbeeldexamen;

public class Metaal extends Atoom{
    private double geleiding = 1;

    public Metaal(String naam, String symbool, int atoomnummer) {
        super(naam, symbool, atoomnummer);
    }

    public Metaal(String naam, String symbool, int atoomnummer, double massa) {
        super(naam, symbool, atoomnummer, massa);
    }

    public void setGeleiding(double geleiding) {
        if (geleiding < 0){
            System.out.println("Geleiding moet positief zijn");
            System.exit(1);
        }
        else {this.geleiding = geleiding;}
    }

    public double getGeleiding() {
        return this.geleiding;
    }

    @Override
    public String toString() {
        return String.format("%-10s - geleiding: %.2f", super.toString(), this.geleiding);
    }
}
