package week10.Drankenlijst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Menu {
    private ArrayList<Drink> dranken = new ArrayList<>();

    public void addDrink(Drink drink){
        this.dranken.add(drink);
    }

    public void addDrinks(Drink[] drinks){
        for (Drink drink : drinks) {
            this.dranken.add(drink);

        }
    }


    public int getSize(){
        return this.dranken.size();
    }

    public double getTotalPrice(){
        double totaal = 0;
        for (Drink drink : this.dranken) {
            totaal += drink.getPrice();
        }
        return totaal;
    }

    public Drink mostExpensiveDrink(){
        if (this.dranken.isEmpty()) return null;

        Drink duurste = this.dranken.get(0);

        for (Drink drink : this.dranken) {
            if (drink.getPrice() > duurste.getPrice()){
                duurste = drink;
            }

        }
        return duurste;
    }

    public ArrayList<Drink> getAlcoholicDrinks(){
        ArrayList<Drink> alcoholic = new ArrayList<>();
        for (Drink drink : this.dranken) {
            if (drink.isAlcoholic()){
                alcoholic.add(drink);
            }
        }
        return alcoholic;
    }

    public void removeMoreExpensiveThen(double price){
        Iterator<Drink> it = this.dranken.iterator();
        while (it.hasNext()) {
            if (it.next().getPrice() > price) {
                it.remove();
            }
        }

    }
    @Override
    public String toString() {
        return "Menu: [drinks=" + dranken + "]";
    }

    // Drankenlijst sorteren
    public void sort(){
        Collections.sort(this.dranken);
    }


}
