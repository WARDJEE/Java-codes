package week12.ProefexamenTransport;

public class Vliegtuig extends Transportmiddel{
    private int maxVlieghoogte;

    public Vliegtuig(String registratiecode, double maxGewicht, int maxVlieghoogte) {
        super(registratiecode, maxGewicht);
        this.maxVlieghoogte = maxVlieghoogte;
    }

    @Override
    public String toString() {
        return String.format("Vliegtuig met een maximale hoogte van %dm: %s", this.maxVlieghoogte, super.toString());
    }
}
