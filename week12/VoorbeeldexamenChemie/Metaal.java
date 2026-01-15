package week12.VoorbeeldexamenChemie;

public class Metaal extends Atoom {
    private double geleiding = 1;

    public Metaal(String naam, String symbool, int atoomnummer){
        super(naam, symbool, atoomnummer);
    }

    public Metaal(String naam, String symbool, int atoomnummer, double massa){
        super(naam, symbool, atoomnummer, massa);
    }

    public double getGeleiding() {
        return geleiding;
    }

    public void setGeleiding(double geleiding) {
        if (geleiding < 0){
            System.out.println("Geleiding moet een positief getal zijn!");
            System.exit(0);
        }
        this.geleiding = geleiding;
    }

    @Override
    public String toString() {
        return String.format("%s - geleiding: %.2f", super.toString(), this.geleiding);
    }
}
