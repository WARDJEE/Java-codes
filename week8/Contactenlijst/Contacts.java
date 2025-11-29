package week8.Contactenlijst;

public class Contacts {
    private final int CAPACITY = 100;
    private Contact[] contacts = new Contact[CAPACITY];
    private int amount = 0;

    public boolean addContact(Contact c) {
        if (amount >= CAPACITY) return false;
        contacts[amount++] = c;
        return true;
    }

    public int getAmount() {
        return amount;
    }

    public Contact getContact(int index) {
        if (index < 0 || index >= amount) return null;
        return contacts[index];
    }

    public boolean removeContact(int index) {
        if (index < 0 || index >= amount) return false;

        for (int i = index; i < amount - 1; i++) {
            contacts[i] = contacts[i + 1];
        }

        contacts[--amount] = null;
        return true;
    }
}

