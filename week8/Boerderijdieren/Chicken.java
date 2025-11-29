package week8.Boerderijdieren;

public class Chicken extends FarmAnimal{
    private int eggsPerWeek;

    public Chicken(String name, int eggsPerWeek){
        super(name, "Toktok", "mais");
        this.eggsPerWeek = eggsPerWeek;
    }

    public int getEggsPerWeek() {
        return this.eggsPerWeek;
    }

    public String toString(){
        return String.format("%s en legt %d eieren per week.", super.toString(), this.eggsPerWeek);
    }
}
