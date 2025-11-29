package week9.Kaartspelletjes2;

public class TestKaartspelletjes {
    static void main() {
        Card[] kaarten = new Card[5];
        int totaleWaarde = 0;

        for (int i = 0; i < 5; i++) {
            kaarten[i] = new Card();
            System.out.println(kaarten[i]);
            totaleWaarde += kaarten[i].getValueAsInt();
        }
        System.out.println("Totale waarde: " + totaleWaarde);
    }
}
