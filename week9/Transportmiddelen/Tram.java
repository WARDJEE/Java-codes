package week9.Transportmiddelen;

public class Tram extends MeansOfTransport{
    public Tram(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double afstand) {
        return geluid("ting", afstand);
    }
}
