package week9.Werknemers;

public class HourlyWorker extends Employee{
    private final int MAX_HOURS_PER_WEEK = 38;
    private int hours;

    public HourlyWorker(String name, long number, int hours) {
        super(name, number);
        this.hours = hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double getWages() {
        if (this.hours <= this.MAX_HOURS_PER_WEEK){
            return this.hours * HOURLY_WAGES;
        }
        else {
            int extraHours = hours - MAX_HOURS_PER_WEEK;
            double wages = MAX_HOURS_PER_WEEK * HOURLY_WAGES;
            double extra = extraHours * HOURLY_WAGES * 1.5;
            return wages + extra;
        }
    }

    public String toString(){
        return String.format("%s %nLoon: %.2f€", super.toString(), this.getWages());
    }
}
