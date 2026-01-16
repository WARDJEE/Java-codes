package week12.Examen;

public class SmartLight extends SmartDevice{
    private final int ENERGY_FACTOR = 3600;
    private int power;

    public SmartLight(String id, String room, DeviceType type,int power) {
        super(id, room, type);
        this.power = power;
    }

    public double getAverageEnergyUsage(){
        return this.power * this.ENERGY_FACTOR;
    }

    public String toString(){
        return String.format("%s power: %d", super.toString(), this.power);
    }

}
