package Peertutoring.Week06_Galgje;

import java.util.Scanner;

public class Galgje1 {
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

        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < lengte; i++) {
            System.out.print(".");
        }
        System.out.println();
        System.out.print("Doe een gok: ");
        String gok = scan.nextLine();
        int kansen = 1;

        do {
        if (!gok.equalsIgnoreCase(woord)){
            System.out.print("Fout! Doe nog een gok: ");
            gok = scan.nextLine();
            kansen += 1;
        }

        else {
            kansen +=1;
            System.out.println("Proficiat, je hebt het woord geraden in "+ kansen +" beurten!");
            kansen += 10;
        }

        }while (kansen < 5);
        if (kansen == 5){
            System.out.println("Je hebt het niet geraden, het woord was \""+woord+"\"");
        }

    }
}
