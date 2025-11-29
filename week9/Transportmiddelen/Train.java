package week9.Transportmiddelen;

public class Train extends MeansOfTransport{
    public Train(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double afstand) {
        return geluid("tuut", afstand);
    }
}
