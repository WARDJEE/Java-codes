package week12.ProefexamenTransport;

public class Vrachtwagen extends Transportmiddel{
    private int aantalAssen;

    public Vrachtwagen(String registratiecode, double maxGewicht, int aantalAssen) {
        super(registratiecode, maxGewicht);
        this.aantalAssen = aantalAssen;
    }

    @Override
    public String toString() {
        return String.format("Vrachtwagen met %d assen: %s", this.aantalAssen, super.toString());
    }
}
