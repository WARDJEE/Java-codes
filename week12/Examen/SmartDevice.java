package week12.Examen;

public abstract class SmartDevice  implements Controllable{
    private String id;
    private String room;
    private DeviceType type;
    private boolean on;

    public SmartDevice(String id, String room, DeviceType type) {
        this.id = id;
        this.room = room;
        this.type = type;
        if (type == DeviceType.LIGHT || type == DeviceType.ALARM){
            this.on = false;
        }

        else this.on = true;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;

    }

    public String getRoom() {
        return this.room;
    }

    public double getAverageEnergyUsage(){
        return 0;
    }

    public String toString(){
        return String.format("%7s: %s at %s: %s,", this.id, this.type.toString(), this.room, this.on? "ON":"OFF");

    }

}
