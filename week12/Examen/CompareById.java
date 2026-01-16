package week12.Examen;
import java.util.Comparator;

public class CompareById implements Comparator<SmartDevice> {
    public int compare(SmartDevice s1, SmartDevice s2){
        return s1.getId().compareTo(s2.getId());
    }
}
