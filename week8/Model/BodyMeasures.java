package week8.Model;

public class BodyMeasures {
    private double bust, hips, waist;

    public BodyMeasures(double bust, double hips, double waist) {
        this.bust = bust;
        this.hips = hips;
        this.waist = waist;
    }

    public BodyMeasures() {
        this.bust = 90;
        this.hips = 60;
        this.waist = 90;
    }



    public double getBust(){
        return this.bust;
    }

    public double getHips() {
        return this.hips;
    }

    public double getWaist() {
        return this.waist;
    }

    public String toString() {
        return String.format("Maten: %.1f %.1f %.1f", this.bust, this.hips, this.waist);
    }
}
