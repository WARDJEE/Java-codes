package week9.Kaartspelletjes2;

import java.util.Random;

public class Card {
    private Suit suit;
    private CardValue value;

    Random random = new Random();

    public Card(Suit suit, CardValue value){
        this.suit = suit;
        this.value = value;
    }

    public Card(){
        Suit[] suits = Suit.values();
        CardValue[] values = CardValue.values();

        this.suit = suits[random.nextInt(suits.length)];
        this.value = values[random.nextInt(values.length)];
    }

    public Suit getSuit() {
        return this.suit;
    }

    public CardValue getValue() {
        return this.value;
    }

    public String toString(){
        return String.format("%s %s", suit.toString(), value.toString());
    }

    public int getValueAsInt(){
        return this.value.getValue();
    }
}
