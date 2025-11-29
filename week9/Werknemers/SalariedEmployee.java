package week9.Werknemers;

public class SalariedEmployee extends Employee{
    private final int WAGE_FACTOR = 192;
    private double wageBarema;

    public SalariedEmployee(String name, long number, double barema){
        super(name, number);
        this.wageBarema = barema;
    }

    @Override
    public double getWages(){
        return HOURLY_WAGES * this.WAGE_FACTOR * this.wageBarema;
    }

    public String toString(){
        return String.format("%s %nLoon: %.2f€", super.toString(), this.getWages());
    }
}
