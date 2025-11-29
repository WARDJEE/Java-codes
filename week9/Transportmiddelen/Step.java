package week9.Transportmiddelen;

public class Step extends MeansOfTransport{
    public Step(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double afstand) {
        return geluid("zzz", afstand);
    }
}
