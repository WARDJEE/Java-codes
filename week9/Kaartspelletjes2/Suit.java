package week9.Kaartspelletjes2;

public enum Suit {
    SPADES, CLUBS, DIAMONDS, HEARTS;

    public String toString(){
       return switch (this){
            case SPADES -> "schoppen";
            case CLUBS -> "klaveren";
            case DIAMONDS -> "ruiten";
            case HEARTS -> "harten";
        };
    }
}
