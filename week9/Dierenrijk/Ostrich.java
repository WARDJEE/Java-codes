package week9.Dierenrijk;

public class Ostrich implements Animal, LaysEggs{
    private String name;
    private int amountOfEggsPerYear;

    public Ostrich(String name, int amountOfEggsPerYear) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAmountOfEggsPerYear() {
        return this.amountOfEggsPerYear;
    }

    public String toString(){
        return String.format("Naam: %s %nEieren: %d", this.name, this.amountOfEggsPerYear);
    }
}
