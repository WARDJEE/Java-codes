package week8.Contactenlijst;

public class TestContacts {
    public static void main(String[] args) {

        Contacts lijst = new Contacts();

        ContactData cd1 = new ContactData("bianca.pieters@thuis.com");
        cd1.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0478/65.25.86"));
        lijst.addContact(new Customer("Bianca Pieters", cd1, 201879));

        ContactData cd2 = new ContactData("genesis.kilic@home.com");
        cd2.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/287.89.75"));
        lijst.addContact(new Customer("Genesis Kiliç", cd2, 987968));

        ContactData cd3 = new ContactData("robin.dworak@dum.com");
        cd3.addPhoneNumber(new PhoneNumber(Kind.FIXED, "03/579.87.99"));
        cd3.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0436/85.77.35.11"));
        lijst.addContact(new Customer("Robin Dwořak", cd3, 166789));

        ContactData cd4 = new ContactData("lucca.verstraete@bedrijf.com");
        cd4.addPhoneNumber(new PhoneNumber(Kind.FIXED, "09/157.99.14"));
        lijst.addContact(new Partner("Lucca Verstraete", cd4, "BE15799318"));

        ContactData cd5 = new ContactData("raf.ghazi@firma.com");
        cd5.addPhoneNumber(new PhoneNumber(Kind.FIXED, "015/87.77.33"));
        cd5.addPhoneNumber(new PhoneNumber(Kind.MOBILE, "0433/33.55.78"));
        lijst.addContact(new Partner("Raf Ghazi", cd5,"BE87986469"));

        // alles afdrukken
        for (int i = 0; i < lijst.getAmount(); i++) {
            System.out.println(lijst.getContact(i));
        }
    }
}

