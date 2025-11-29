package week9.Transportmiddelen;

public class Main {
    public static void main(String[] args) {
        MeansOfTransport[] meansOfTransport = new MeansOfTransport[] {
                new Bus(50), new Tram(40), new Train(120), new Bike(25),
                new OnFoot(5), new Step(20)
        };
        // schrijf hier code zodat ieder transportmiddel 10 km moet afleggen
        for (MeansOfTransport voertuig : meansOfTransport){
            System.out.println(voertuig.travelDistance(10));
        }
    }
}
