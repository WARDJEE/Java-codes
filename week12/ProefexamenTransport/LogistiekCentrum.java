package week12.ProefexamenTransport;

import java.util.*;

public class LogistiekCentrum {
    private Set<Transportmiddel> vloot;
    private Map<Pakket, Integer> voorraad;

    public LogistiekCentrum() {
        this.vloot = new HashSet<>();
        this.voorraad = new HashMap<>();
    }

    public void voegPakketToe(Pakket pakket, int aantal){
        if (this.voorraad.containsKey(pakket)){
            this.voorraad.put(pakket, this.voorraad.get(pakket)+aantal);
        }

        else {this.voorraad.put(pakket, aantal);}
    }

    public void toonVoorraadGesorteerd(){
        List<Pakket> pakketten= new ArrayList<>(this.voorraad.keySet());
        pakketten.sort(new CompareByBestemming());
        for (Pakket pakket : pakketten){
            System.out.println(pakket);
        }

    }

    public void voegTransportmiddelToe(Transportmiddel t) {
        this.vloot.add(t);
    }

    public void laadTransportmiddel(Transportmiddel t) {
        List<Pakket> pakketten = new ArrayList<>(this.voorraad.keySet());

        for (Pakket pakket : pakketten) {
            int aantal = voorraad.get(pakket);

            while (aantal > 0 && (t.getHuidigGewicht() + pakket.getGewicht() <= t.getMaxGewicht())) {

                t.setHuidigGewicht(t.getHuidigGewicht() + pakket.getGewicht());

                aantal--;

                if (aantal == 0) {
                    this.voorraad.remove(pakket);
                } else {
                    this.voorraad.put(pakket, aantal);
                }
            }
        }
    }
}
