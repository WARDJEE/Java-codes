package week8.Contactenlijst;

public class ContactData {
    private String email;
    private PhoneNumber[] numbers = new PhoneNumber[5];
    private int amount = 0;

    public ContactData(String email) {
        this.email = email;
    }

    public boolean addPhoneNumber(PhoneNumber p) {
        if (amount >= 5) return false;
        numbers[amount++] = p;
        return true;
    }

    public PhoneNumber getFixed() {
        for (int i = 0; i < amount; i++) {
            if (numbers[i].getKind() == Kind.FIXED) return numbers[i];
        }
        return null;
    }

    public PhoneNumber getMobile() {
        for (int i = 0; i < amount; i++) {
            if (numbers[i].getKind() == Kind.MOBILE) return numbers[i];
        }
        return null;
    }

    public String getEmail() {
        return email;
    }
}

