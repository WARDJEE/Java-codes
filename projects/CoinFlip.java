package projects;

import java.util.Random;
public class CoinFlip {
    static void main() {
        Random random = new Random();
        boolean isHeads = random.nextBoolean();

        System.out.println(isHeads? "Heads":"Tails");
    }
}
