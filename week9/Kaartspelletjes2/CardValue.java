package week9.Kaartspelletjes2;

public enum CardValue {
    ACE(1, "aas"),
    TWO(2, "twee"),
    THREE(3, "drie"),
    FOUR(4, "vier"),
    FIVE(5, "vijf"),
    SIX(6, "zes"),
    SEVEN(7, "zeven"),
    EIGHT(8, "acht"),
    NINE(9, "negen"),
    TEN(10, "tien"),
    JACK(10, "boer"),
    QUEEN(10, "dame"),
    KING(10, "heer");

    private int value;
    private String naam;

    CardValue(int value, String naam) {
        this.value = value;
        this.naam = naam;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return String.format("%s (%d)", this.naam, this.value);
    }
}
