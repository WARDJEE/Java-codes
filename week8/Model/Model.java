package week8.Model;

public class Model extends Person {
    private BodyMeasures measures;
    private Address address;

    public Model(String name,double bust, double hips, double waist) {
        super(name);
        measures = new BodyMeasures(bust, hips, waist);
        address = new Address("Onbekend",  "Onbekend");

    }

    public Model(String name){
        this(name, 90, 60, 90);
    }

    public double getBust(){
        return this.measures.getBust();
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public String toString(){
        return String.format("%s \n%s \n%s", super.toString(), measures.toString(), address.toString());
    }
}
