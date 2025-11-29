package week9.Dierenrijk;

public class Swallow implements Animal, LaysEggs, CanFly{
    private String name;
    private int amountOfEggsPerYear;
    private double maxFlyingSpeed;

    public Swallow(String name, int amountOfEggsPerYear, double maxFlyingSpeed) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getAmountOfEggsPerYear() {
        return this.amountOfEggsPerYear;
    }

    public double getMaxFlyingSpeed() {
        return this.maxFlyingSpeed;
    }

    public String toString(){
        return String.format("Naam: %s %nEieren: %d %nSnelheid: %.0f km/h", this.name, this.amountOfEggsPerYear, this.maxFlyingSpeed);
    }
}
