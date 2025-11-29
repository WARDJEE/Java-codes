package week8.Boerderijdieren;

public class Cow extends FarmAnimal {
    private double literMilkPerDay;

    public Cow(String name, double literPerDay){
        super(name, "Boeboe", "gras");
        this.literMilkPerDay = literPerDay;
    }

    public double getLiterMilkPerDay() {
        return this.literMilkPerDay;
    }

    public String toString(){
        return String.format("%s en geeft %.1f litermelk per dag.", super.toString(), this.literMilkPerDay);
    }
}
