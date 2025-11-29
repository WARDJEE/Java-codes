package week9.Dierenrijk;

public class Eagle implements Animal, CanFly, LaysEggs{
    private String name;
    private int amountOfEggsPerYear;
    private double maxFlyingSpeed, maxDivingSpeed;

    public Eagle(String name, int amountOfEggsPerYear, double maxFlyingSpeed, double maxDivingSpeed) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
        this.maxDivingSpeed = maxDivingSpeed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAmountOfEggsPerYear() {
        return this.amountOfEggsPerYear;
    }

    @Override
    public double getMaxFlyingSpeed() {
        return this.maxFlyingSpeed;
    }

    public double getMaxDivingSpeed() {
        return this.maxDivingSpeed;
    }

    public String toString(){
        return String.format("Naam: %s %nEieren: %d %nSnelheid: %.0f km/h %nDuiksnelheid: %.0f km/h", this.name, this.amountOfEggsPerYear, this.maxFlyingSpeed, this.maxDivingSpeed);
    }
}
