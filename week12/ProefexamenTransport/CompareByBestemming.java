package week12.ProefexamenTransport;

import java.util.Comparator;

public class CompareByBestemming implements Comparator<Pakket> {
    public int compare(Pakket pakket1, Pakket pakket2){
        return pakket1.getBestemming().compareTo(pakket2.getBestemming());
    }
}
