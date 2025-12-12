package Peertutoring.Week06_Galgje;

import java.util.Scanner;

public class Galgje2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String woord;
        int lengte;
        do {
            System.out.print("Geef een woord (min 5, max 10): ");
            woord = scan.nextLine();
            lengte = woord.length();
        }while (lengte < 5 || lengte > 10);

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        StringBuilder puntjes = new StringBuilder();
        puntjes.append(".".repeat(lengte));
        System.out.print("Het te zoeken woord: " + puntjes);
        System.out.println();
        int kansen = 0;

        do {
            System.out.print("Raad een letter: ");
            char gok = scan.next().charAt(0);

            if (woord.contains(String.valueOf(gok))){
                for (int i = 0; i < lengte; i++) {
                    if (gok == woord.charAt(i)){
                        puntjes.setCharAt(i, gok);
                    }
                }

                System.out.println("Het te zoeken woord: " + puntjes);
            }

            else {
                System.out.println("Het te zoeken woord: " + puntjes);
            }
            kansen += 1;


        }while (!woord.contentEquals(puntjes));
        System.out.println("Proficiat, je hebt het woord geraden in "+ kansen + "beurten!");
    }
}
