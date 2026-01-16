package week12.Examen;

public class MotionSensor extends SmartDevice{
    private boolean motionDetected;

    public MotionSensor(String id, String room, DeviceType type) {
        super(id, room, type);
    }

    public void setMotionDetected(boolean motionDetected) {
        this.motionDetected = motionDetected;
    }

    public boolean isMotionDetected(){
        return this.motionDetected;
    }

    public double getAverageEnergyUsage(){
        return 0.5;
    }

    public String toString(){
        return String.format("%s %smotion detected", super.toString(), this.motionDetected? "":"no ");
    }
}
