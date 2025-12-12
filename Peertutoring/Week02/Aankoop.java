package Peertutoring.Week02;
import java.util.Scanner;
public class Aankoop {
    static void BTW(double prijs) {
        if (prijs < 0){
            prijs = 0;
            System.out.println("Ongeldige prijs, wordt op 0 gezet.");
        }
        System.out.println("Prijs incl. BTW: " + (prijs + prijs*0.21));
    }

    public static void main(String[] args) {
        double totalePrijs;
        double korting;
        double prijs1;
        double prijs2;
        double prijs3;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef de prijs van product 1: ");
        prijs1 = scan.nextDouble();
        BTW(prijs1);

        System.out.print("Geef de prijs van product 2: ");
        prijs2 = scan.nextDouble();
        BTW(prijs2);

        System.out.print("Geef de prijs van product 3: ");
        prijs3 = scan.nextDouble();
        BTW(prijs3);

        if (prijs1 < 0){
            prijs1 = 0;
        }
        else if (prijs2 < 0){
            prijs2 = 0;
        }

        if (prijs3 < 0){
            prijs3 = 0;
        }

        totalePrijs = (prijs1 * 1.21) + (prijs2 * 1.21) + (prijs3 * 1.21);
        System.out.println();
        System.out.println("Totale prijs: " + totalePrijs);
        if (totalePrijs > 100){
            korting = totalePrijs * 0.1;
            System.out.println("Korting toegepast: " + korting);
            totalePrijs -= korting;
            System.out.println("Eindrprijs: " + totalePrijs);
            if (totalePrijs > 200){
                System.out.println("U krijgt een extra geschenk!");
            }
        }
        else if(totalePrijs == 0){
            System.out.println("Geen producten gekocht.");
        }
    }
}
