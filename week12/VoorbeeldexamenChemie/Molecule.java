package week12.VoorbeeldexamenChemie;


import java.util.*;

public class Molecule implements Reactant {
    private Map<Atoom, Integer > atomen;

    public Molecule(){
        this.atomen = new HashMap<>();
    }

    public void voegAtoomToe(Atoom atoom, int aantal){
        if (aantal < 0){
            System.out.println("Aantal mag niet negatief zijn!");
            aantal = 1;
        }
        if (this.atomen.containsKey(atoom)){
            this.atomen.put(atoom, this.atomen.get(atoom)+aantal);
        }

        else this.atomen.put(atoom, aantal);
    }

    public void voegAtoomToe(Atoom atoom){
        voegAtoomToe(atoom, 1);
    }

    public double getMassa(){
        double massa = 0;
        for (Atoom atoom : atomen.keySet()) {
            massa += atoom.getMassa() * this.atomen.get(atoom);
        }
        return massa;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Atoom atoom : atomen.keySet()) {
            sb.append(atoom.getSymbool());
            sb.append((this.atomen.get(atoom) == 1)? "":this.atomen.get(atoom));

        }
        return sb.toString();
    }


    @Override
    public boolean isLeeg() {
        return this.atomen.isEmpty();
    }

    @Override
    public Atoom genereerAtoom() {
        Random random = new Random();
        List<Atoom> atomen = new ArrayList<>(this.atomen.keySet());

        Atoom verwijderd = atomen.get(random.nextInt(atomen.size()));
        if (this.atomen.get(verwijderd) > 1){
            this.atomen.put(verwijderd, this.atomen.get(verwijderd)-1);
        }
        else {this.atomen.remove(verwijderd);}
        return verwijderd;
    }
}
