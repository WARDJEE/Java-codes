package week8.Contacten;

public class Customer extends Contact{
    private int id;

    public Customer(String name, ContactData contactData, int id){
        super(name, contactData);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String toString(){
        return String.format("Klant (%d): %s", this.id, super.toString());
    }
}
