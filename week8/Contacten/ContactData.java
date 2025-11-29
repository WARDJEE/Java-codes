package week8.Contacten;

public class ContactData {
    final private int MAX_PHONE_NUMBERS = 5;
    private String email;
    private PhoneNumber[] phoneNumbers = new PhoneNumber[MAX_PHONE_NUMBERS];
    private int numberOfPhoneNumbers = 0;

    public ContactData(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void addPhoneNumber(PhoneNumber number) {
        if (numberOfPhoneNumbers < MAX_PHONE_NUMBERS) {
            this.phoneNumbers[this.numberOfPhoneNumbers] = number;
            this.numberOfPhoneNumbers++;
        }
    }

    public PhoneNumber[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String toString() {
        PhoneNumber fixed = null;
        PhoneNumber mobile = null;

        for(
        PhoneNumber nummer :phoneNumbers) {
            if (nummer == null) continue;
            if (nummer.getKind() == Kind.FIXED) fixed = nummer;
            if (nummer.getKind() == Kind.MOBILE) mobile = nummer;
        }

        String vaste = (fixed != null) ? fixed.toString() : "geen vast nummer";
        String mobiel = (mobile != null) ? mobile.toString() : "geen mobiel nummer";

        return String.format("%s, %s, %s",email,vaste,mobiel);
    }

}
