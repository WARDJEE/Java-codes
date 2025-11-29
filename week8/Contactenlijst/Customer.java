package week8.Contactenlijst;

public class Customer extends Contact {
    private int customerNr;

    public Customer(String name, ContactData data, int customerNr) {
        super(name, data);
        this.customerNr = customerNr;
    }

    @Override
    public String toString() {
        return "Klant (" + customerNr + "): " +
                "Contact: " +
                name + ", " + data.getEmail() + ", " + formattedPhoneNumbers();
    }
}

