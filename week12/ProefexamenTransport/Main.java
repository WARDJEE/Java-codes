package week12.ProefexamenTransport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // DEEL 1: Transportmiddelen aanmaken
        // Net als in jouw TabelMendeljev voorbeeld maken we objecten aan
        System.out.println("--- DEEL 1: Vloot aanmaken ---");
        Vrachtwagen v1 = new Vrachtwagen("TRUCK-001", 2000.0, 4);
        Vrachtwagen v2 = new Vrachtwagen("TRUCK-002", 5000.0, 6);
        Vliegtuig vl1 = new Vliegtuig("PLANE-747", 15000.0, 10000);

        LogistiekCentrum centrum = new LogistiekCentrum();
        centrum.voegTransportmiddelToe(v1);
        centrum.voegTransportmiddelToe(v2);
        centrum.voegTransportmiddelToe(vl1);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(vl1);


        // DEEL 2: Pakketten toevoegen aan voorraad
        // Vergelijkbaar met Molecule.voegAtoomToe(atoom, aantal)
        System.out.println("\n--- DEEL 2: Voorraad beheren ---");
        Pakket p1 = new Pakket("P001", 500.0, "Antwerpen");
        Pakket p2 = new Pakket("P002", 1200.0, "Brussel");
        Pakket p3 = new Pakket("P003", 300.0, "Antwerpen");
        Pakket p4 = new Pakket("P004", 2500.0, "Gent");

        centrum.voegPakketToe(p1, 3);
        centrum.voegPakketToe(p2, 1);
        centrum.voegPakketToe(p3, 5);
        centrum.voegPakketToe(p4, 2);

        System.out.println("Voorraad gesorteerd op bestemming:");
        centrum.toonVoorraadGesorteerd();

        // DEEL 3: Sorteren van de vloot
        // Gebruik van een list en sort() zoals in TabelMendeljev.printMetalen()
        System.out.println("\n--- DEEL 3: Vrachtwagens sorteren ---");
        List<Vrachtwagen> vrachtwagens = new ArrayList<>();
        vrachtwagens.add(v1);
        vrachtwagens.add(v2);

        // Sorteren via een specifieke Comparator
        vrachtwagens.sort(new VrachtwagenComparator());
        for (Vrachtwagen v : vrachtwagens) {
            System.out.println(v); // Gebruikt toString()
        }

        // DEEL 4: Laden van een transportmiddel
        // Vergelijkbaar met het 'consumeren' van atomen in een Reactie
        System.out.println("\n--- DEEL 4: Laden van vrachtwagen TRUCK-002 ---");
        System.out.println("Huidig gewicht voor laden: " + v2.getHuidigGewicht());

        centrum.laadTransportmiddel(v2);

        System.out.println("Huidig gewicht na laden: " + v2.getHuidigGewicht());
        System.out.println("\nResterende voorraad in centrum na laden:");
        centrum.toonVoorraadGesorteerd();
    }
}