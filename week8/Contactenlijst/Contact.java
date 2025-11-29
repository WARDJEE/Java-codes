package week8.Contactenlijst;

public class Contact {
    protected String name;
    protected ContactData data;

    public Contact(String name, ContactData data) {
        this.name = name;
        this.data = data;
    }

    protected String formattedPhoneNumbers() {
        PhoneNumber fixed = data.getFixed();
        PhoneNumber mobile = data.getMobile();

        String fixedStr = (fixed == null) ? "geen vast nummer" : fixed.toString();
        String mobileStr = (mobile == null) ? "geen mobiel nummer" : mobile.toString();

        return fixedStr + ", " + mobileStr;
    }

    @Override
    public String toString() {
        return "Contact: " + name + ", " + data.getEmail() + ", " + formattedPhoneNumbers();
    }
}

