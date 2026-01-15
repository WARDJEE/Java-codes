package week12.ProefexamenTransport;

import java.util.Objects;

public class Transportmiddel {
    private String registratiecode;
    private double maxGewicht;
    private double huidigGewicht;

    public Transportmiddel(String registratiecode, double maxGewicht) {
        if (registratiecode.isEmpty()){
            System.out.println("Registratiecode mag niet leeg zijn!");
            System.exit(1);
        }

        if (maxGewicht < 0){
            System.out.println("Maximaal gewicht moet positief zijn!");
            System.exit(1);
        }

        this.registratiecode = registratiecode;
        this.maxGewicht = maxGewicht;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Transportmiddel that)) return false;
        return Objects.equals(registratiecode, that.registratiecode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registratiecode);
    }

    public double getMaxGewicht(){
        return this.maxGewicht;
    }

    public String getRegistratiecode() {
        return registratiecode;
    }

    public double getHuidigGewicht() {
        return huidigGewicht;
    }

    public void setHuidigGewicht(double huidigGewicht) {
        this.huidigGewicht = huidigGewicht;
    }

    @Override
    public String toString() {
        return String.format("- Registratiecode: %-9s - Maxgewicht: %-7.2f - Huidig gewicht: %.2f", registratiecode, maxGewicht, huidigGewicht);
    }
}
