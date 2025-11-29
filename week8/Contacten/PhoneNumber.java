package week8.Contacten;

public class PhoneNumber {
    private Kind kind;
    private String number;

    public PhoneNumber(Kind kind, String number){
        this.kind = kind;
        this.number = number;
    }

    public Kind getKind() {

        return this.kind;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString(){
        return String.format("%s (%s)", this.number, (this.kind == Kind.MOBILE ? "M":"V"));
    }
}
