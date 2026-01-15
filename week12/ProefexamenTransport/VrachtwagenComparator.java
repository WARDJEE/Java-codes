package week12.ProefexamenTransport;

import java.util.Comparator;

public class VrachtwagenComparator implements Comparator<Vrachtwagen> {
    public int compare(Vrachtwagen vrachtwagen1, Vrachtwagen vrachtwagen2){
        int maxGewicht = Double.compare(vrachtwagen2.getMaxGewicht(), vrachtwagen1.getMaxGewicht());
        if (maxGewicht != 0) return maxGewicht;

        return vrachtwagen1.getRegistratiecode().compareTo(vrachtwagen2.getRegistratiecode());
    }
}
