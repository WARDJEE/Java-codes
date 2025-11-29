package week9.Transportmiddelen;

public class OnFoot extends MeansOfTransport{
    public OnFoot(double speed){
        super(speed);
    }

    @Override
    public String travelDistance(double afstand) {
        return geluid("stap", afstand);
    }
}
