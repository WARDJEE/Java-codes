package week8.Model;

public class Address {
    private String streetNr, zipCode;

    public Address(String streetNr, String zipCode){
        this.streetNr = streetNr;
        this.zipCode = zipCode;
    }

    public String getStreetNr() {
        return this.streetNr;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String toString(){
        return String.format("Adres: %s %s", this.streetNr, this.zipCode);
    }
}
