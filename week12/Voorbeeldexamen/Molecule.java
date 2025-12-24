package week12.Voorbeeldexamen;

import java.util.HashMap;
import java.util.Map;

public class Molecule {
    private Map<Atoom, Integer> atomen;

    public Molecule() {
        this.atomen = new HashMap<>();
    }

    public void voegAtoomToe(Atoom atoom, int aantal){
        if (this.atomen.containsKey(atoom)){
            this.atomen.put(atoom, this.atomen.get(atoom)+aantal);
        }
        else {this.atomen.put(atoom, aantal);}
    }

    public void voegAtoomToe(Atoom atoom){
        if (this.atomen.containsKey(atoom)){
            this.atomen.put(atoom, this.atomen.get(atoom)+1);
        }
        
        else {this.atomen.put(atoom, 1);}
    }

    public double getMassa(){
        double totaleMassa = 0;
        for (Atoom atoom : atomen.keySet()) {
            totaleMassa += atoom.getMassa()*atomen.get(atoom);

        }
        return totaleMassa;
    }
}
