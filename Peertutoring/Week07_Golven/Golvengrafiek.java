package Peertutoring.Week07_Golven;

import java.awt.*;
import java.util.Random;

public class Golvengrafiek {
    private Golf[] golven;

    Random random = new Random();

    public Golvengrafiek(int aantalGolven) {
        this.golven = new Golf[aantalGolven];
        maakGolven();
    }

    public void maakGolven() {
        for (int i = 0; i < golven.length; i++) {
            Golf golf = new Golf();
            golf.setAmplitude(random.nextDouble(0.1, 4.0));
            golf.setFrequentie(random.nextDouble(0.1, 4.0));
            golf.setFase(random.nextDouble(-1.0, 1.0));
            this.golven[i] = golf;
        }
    }

    public void tekenGolven() {
        GrafiekWindow window = new GrafiekWindow(10, 6);
        for (Golf golf : golven) {
            Color color = getRandomColor();

            for (double x = -5; x < 5; x += 0.001) {
                window.tekenPunt(x, golf.getYwaarde(x), color);
            }
        }
        window.toon();
    }

    Color getRandomColor() {
        int r = random.nextInt(0, 255);
        int g = random.nextInt(0, 255);
        int b = random.nextInt(0, 255);
        return new Color(r, g, b);
    }
}
