package Peertutoring.Week07_Golven;

public class Golf {
    private double amplitude, frequentie, fase;

    public Golf(){
        this.amplitude = 1.0;
        this.frequentie = 1.0;
        this.fase = 0.0;
    }

    public void setAmplitude(double amplitude){
        if (amplitude <= 0) {
            this.amplitude = amplitude;
        }

        else this.amplitude = 1.0;
    }

    public void setFrequentie(double frequentie){
        if (frequentie <= 0){
            this.frequentie = 1.0;

        }
        else this.frequentie = frequentie;

    }

    public void setFase(double fase){
        this.fase = fase;
    }

    public double getYwaarde(double x){
        return this.amplitude * Math.sin (this.frequentie * x + this.fase);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("y = ");

        if (amplitude != 1.0) sb.append(String.format("%.1f * ", amplitude));

        sb.append("sin(");

        if (frequentie != 1.0) sb.append(String.format("%.1f * ", frequentie));

        sb.append("x");

        if (fase > 0) sb.append(" + ").append(String.format("%.1f", fase));
        else if (fase < 0) sb.append(" - ").append(String.format("%.1f", Math.abs(fase)));

        sb.append(")");
        return sb.toString();
    }
}
