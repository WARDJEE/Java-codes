package week12.VoorbeeldexamenChemie;


import java.util.*;

public class TabelMendeljev implements Reactant {
    private Set<Atoom> atomen;

    public TabelMendeljev(){
        this.atomen = new HashSet<>();
    }

    public void voegAtoomToe(Atoom atoom){
        this.atomen.add(atoom);
    }

    public void printMetalen(){
        List<Metaal> metalen = new ArrayList<>();
        System.out.println("De metalen:");
        for (Atoom atoom : atomen) {
            if (atoom instanceof Metaal){
               metalen.add((Metaal) atoom);
            }
        }
        metalen.sort(new CompareByGeleiding());
        for (Metaal metaal : metalen) {
            System.out.println(metaal);
        }

    }

    public void print(){
        List<Atoom> atomen = new ArrayList<>(this.atomen);
        atomen.sort(new CompareByAtoomnummer());
        for (Atoom atoom : atomen) {
                System.out.println(atoom);
        }
    }

    @Override
    public boolean isLeeg() {
        return false;

    }

    @Override
    public Atoom genereerAtoom() {
        if (this.atomen.isEmpty()) {
            System.out.println("Geen atomen!");
        }

        Random random = new Random();
        List<Atoom> atomen = new ArrayList<>(this.atomen);

        return atomen.get(random.nextInt(atomen.size()));
    }
}
