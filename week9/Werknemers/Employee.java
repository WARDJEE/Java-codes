package week9.Werknemers;

public abstract class Employee {
    protected final double HOURLY_WAGES = 12.5;
    private String name;
    private long nationalNumber;

    public Employee(String name, long number){
        this.name = name;
        this.nationalNumber = number;
    }

    public String getName(){
        return this.name;
    }

    public long getNationalNumber() {
        return this.nationalNumber;
    }

    public abstract double getWages();

    public String toString(){
        return "Name: " + this.name + "\nNummer: " + this.nationalNumber;
    }

}
