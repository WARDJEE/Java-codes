package week9.Transportmiddelen;

public abstract class MeansOfTransport {
    private double speed;

    public MeansOfTransport(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public abstract String travelDistance(double afstand);

    public String geluid(String geluid, double afstand){
        StringBuilder sb = new StringBuilder();
        double snelheid = 10*afstand/this.speed;
        for (int i = 0; i < Math.round(snelheid)-1; i++) {
            sb.append(geluid);
            sb.append("-");
        }
        sb.append(geluid);
        return sb.toString();
    }
}
