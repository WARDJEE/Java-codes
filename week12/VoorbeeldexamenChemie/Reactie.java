package week12.VoorbeeldexamenChemie;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reactie {
    private String beschrijving;
    private Reactant reactant1;
    private Reactant reactant2;
    private LocalTime starttijd;
    private LocalTime eindtijd;
    private Molecule eindproduct;

    public Reactie(String beschrijving, Reactant reactant1, Reactant reactant2) {
        this.beschrijving = beschrijving;
        this.reactant1 = reactant1;
        this.reactant2 = reactant2;
    }

    public void start() {
        this.starttijd = LocalTime.now();
        this.eindproduct = new Molecule();

        while (!this.reactant1.isLeeg() && !this.reactant2.isLeeg()) {


                this.eindproduct.voegAtoomToe(this.reactant1.genereerAtoom());

                this.eindproduct.voegAtoomToe(this.reactant2.genereerAtoom());

        }
    }

    public void printVerslag() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(this.beschrijving);
        String formatted = this.starttijd.format(formatter);
        System.out.println("Starttijd: " + formatted);
        System.out.println("Eindeproduct: " + this.eindproduct);
    }
}
