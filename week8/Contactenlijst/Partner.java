package week8.Contactenlijst;

public class Partner extends Contact {
    private String btw;

    public Partner(String name, ContactData data, String btw) {
        super(name, data);
        this.btw = btw;
    }

    @Override
    public String toString() {
        return "Partner (" + btw + "): " +
                "Contact: " +
                name + ", " + data.getEmail() + ", " + formattedPhoneNumbers();
    }
}
