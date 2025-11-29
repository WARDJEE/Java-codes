package week9.Transportmiddelen;

public class Bike extends MeansOfTransport {
    public Bike(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double afstand) {
        return geluid("iepe", afstand);
    }
}
