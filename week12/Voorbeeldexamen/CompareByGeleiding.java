package week12.Voorbeeldexamen;

import java.util.Comparator;

public class CompareByGeleiding implements Comparator<Metaal> {
    public int compare(Metaal m1, Metaal m2){
        return Double.compare(m2.getGeleiding(), m1.getGeleiding());

    }
}
