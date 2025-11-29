package week9.Transportmiddelen;

public class Bus extends MeansOfTransport{
     public Bus(double speed){
         super(speed);
     }

    @Override
    public String travelDistance(double afstand) {
        return geluid("vroem", afstand);
    }
}
