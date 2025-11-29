package week9;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Leeftijd {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int dag = scan.nextInt();

        System.out.print("Geef je geboortemaand: ");
        int maand = scan.nextInt();

        System.out.print("Geef je geboortejaar: ");
        int jaar = scan.nextInt();

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);

        Period leeftijd = Period.between(geboortedatum, LocalDate.now());

        System.out.println("Je bent nu " + leeftijd.getYears() + " jaren, " + leeftijd.getMonths() + " maanden en " + leeftijd.getDays() + " dagen.");
        System.out.println("Je bent geboren op een " + geboortedatum.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("nl", "NL")));
    }
}
