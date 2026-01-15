package week12.ProefexamenTransport;

import java.util.Objects;

public class Pakket implements Lading{
    private String code;
    private double gewicht;
    private String bestemming;

    public Pakket(String code, double gewicht, String bestemming) {
        this.code = code;
        this.gewicht = gewicht;
        this.bestemming = bestemming;
    }

    @Override
    public double getGewicht() {
        return this.gewicht;
    }

    @Override
    public String getBestemming() {
        return this.bestemming;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pakket pakket)) return false;
        return Objects.equals(code, pakket.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return String.format("Pakket %s: - Gewicht: %.2f - Bestemming: %s", code, gewicht, bestemming);
    }
}
