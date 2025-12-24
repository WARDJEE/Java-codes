package week12.Voorbeeldexamen;

import java.util.*;

public class TabelMendeljev {
    private Set<Atoom> atomen;

    public TabelMendeljev() {
        this.atomen = new HashSet<>();
    }

    public void voegAtoomToe(Atoom atoom){
        this.atomen.add(atoom);
    }

    public void printMetalen(){
        List<Metaal> list = new ArrayList<>();

        for (Atoom atoom : this.atomen) {
            if (atoom instanceof Metaal){
                list.add((Metaal) atoom);
            }
        }
        Collections.sort(list, new CompareByGeleiding());

        System.out.println("De metalen:");
        for (Metaal metaal : list) {
            System.out.println(metaal);
        }

    }

    public void print(){
        List<Atoom> list = new ArrayList<>(this.atomen);

        Collections.sort(list, new CompareByAtoomnummer());

        for (Atoom atoom : atomen) {
            System.out.println(atoom);
        }
    }




}
