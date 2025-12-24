package week12.Voorbeeldexamen;

import java.util.Objects;

public abstract class Atoom {
    private String naam;
    private String symbool;
    private int atoomnummer;
    private double massa;

    public Atoom(String naam, String symbool, int atoomnummer) {
        this.naam = naam;
        this.symbool = symbool;
        this.atoomnummer = atoomnummer;

        if (naam == null || naam.isEmpty()){
            System.out.println("Naam mag niet null of leeg zijn!");
            System.exit(1);
        }
        else {this.naam = naam;}

        if (symbool.length() > 2){
            System.out.println("Symbool mag maximum 2 characters lang zijn!");
            System.exit(1);
        }
        else {this.symbool = symbool;}

        if (atoomnummer < 1){
            System.out.println("Atoomnummer moet minstens 1 zijn!");
            System.exit(1);
        }

        this.massa = 2*atoomnummer;
    }

    public Atoom(String naam, String symbool, int atoomnummer, double massa) {
        this(naam, symbool, atoomnummer);

        if (massa < 0){
            System.out.println("Massa moet positief zijn!");
            System.exit(1);
        }
        else {this.massa = massa;}
    }

    public double getMassa() {
        return this.massa;
    }

    public String getSymbool() {
        return this.symbool;
    }

    public int getAtoomnummer() {
        return this.atoomnummer;
    }

    @Override
    public String toString() {
        return String.format("%-15s - atoomnummer: %3d - massa: %-5.1f", this.naam + " ("+this.symbool+")", this.atoomnummer, this.massa);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Atoom atoom)) return false;
        return atoomnummer == atoom.atoomnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(atoomnummer);
    }
}
