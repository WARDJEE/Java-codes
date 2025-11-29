package week8.Contacten;

public class Partner extends Contact{
    private String companyNumber;

    public Partner(String name, ContactData contactData, String companyNumber){
        super(name, contactData);
        this.companyNumber = companyNumber;
    }

    public String getCompanyNumber() {
        return this.companyNumber;
    }

    public String toString(){
        return String.format("Partner (%s): %s", this.companyNumber, super.toString());
    }
}


