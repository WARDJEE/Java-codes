package week12.VoorbeeldexamenChemie;

import java.util.Objects;

public abstract class Atoom {
    private String naam;
    private String symbool;
    private int atoomnummer;
    private double massa;

    public Atoom(String naam, String symbool, int atoomnummer){
        if (naam == null || naam.isEmpty()) {
            System.out.println("Naam mag niet 'null' of leeg zijn!");
            System.exit(1);
        }

        if (symbool.length() > 2 || symbool.isEmpty()){
            System.out.println("Symbool moet uit 1 of 2 characters bestaan!");
            System.exit(1);
        }

        if (atoomnummer < 0){
            System.out.println("Atoomnummer moet geheel positief zijn!");
            System.exit(1);
        }

        this.naam = naam;
        this.symbool = symbool;
        this.atoomnummer = atoomnummer;
        this.massa = 2*atoomnummer;
    }

    public Atoom(String naam, String symbool, int atoomnummer, double massa){
        this(naam, symbool, atoomnummer);
        if (massa < 0){
            System.out.println("Massa moet positief zijn!");
            System.exit(1);
        }

        this.massa = massa;
    }

    public String getSymbool() {
        return symbool;
    }

    public double getMassa() {
        return massa;
    }

    public int getAtoomnummer() {
        return atoomnummer;
    }

    @Override
    public String toString() {
        return String.format("%-12s  - atoomnummer: %3d - massa: %-6.1f", this.naam + "("+this.symbool+")", this.atoomnummer, this.massa);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Atoom atoom)) return false;
        return atoomnummer == atoom.atoomnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(atoomnummer);
    }
}
