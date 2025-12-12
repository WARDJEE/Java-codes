package Peertutoring.Week02;
import java.util.Scanner;

public class Digitale_verslaving {
    private static int ja = 0;

    static void vraag(String zin){
        Scanner scan = new Scanner(System.in);
        String antwoord;

        do {System.out.print(zin);
            antwoord = scan.nextLine();

        }while (!(antwoord.toLowerCase().strip()).equals("ja") && !(antwoord.toLowerCase().strip()).equals("nee"));
        if (antwoord.equals("ja")){
            ja++;
        }

    }


    public static void main(String[] args) {

        String zin1 = "Het laatste wat ik doe -voor ’s avonds het licht" +
                " uit gaat- is nog snel even kijken of er nog iets aan " +
                "berichten, enz is binnengekomen op mijn smartphone: ";

        String zin2 = "Het eerste wat ik doe -al ’s morgens het licht aangaat- " +
                        "is kijken of er berichten, enz zijn binnengekomen op mijn smartphone: ";

        String zin3 = "Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone.";

        String zin4 = "Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is";

        String zin5 = "Terwijl is naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone.";

        String zin6 = "Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.";

        String zin7 = "Als ik in gezelschap -familie, vrienden,… eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd.";

        String zin8 = "Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone.";

        String zin9 = "Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm.";

        String zin10 = "Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken.";

        Scanner scan = new Scanner(System.in);
        String keuze;
        int aantal = 0;
        int verslaafd = 0;

        do {
            aantal++;
            ja = 0;
            System.out.print("Geef je naam: ");
            String naam = scan.nextLine();

            if (aantal > 1) {
                double percentage = ((double) verslaafd / (aantal-1)) * 100;
                System.out.println("Deze enquête werd reeds door " + (aantal-1) + " gebruikers ingevuld, " + percentage + "% hiervan had een ernstige of extreme vorm van digitale verslaving…");
            } else {
                System.out.println("U bent de eerste gebruiker die de enquête invult!");
            }

            System.out.println();
            vraag(zin1);
            vraag(zin2);
            vraag(zin3);
            vraag(zin4);
            vraag(zin5);
            vraag(zin6);
            vraag(zin7);
            vraag(zin8);
            vraag(zin9);
            vraag(zin10);

            System.out.println();

            switch (ja) {
                case 0 -> System.out.println("U bent niet digitaal verslaafd " + naam + ". Houden zo!");

                case 1, 2 ->
                    System.out.println("U hebt een milde vorm van digitale verslaving " + naam + ".");

                case 3, 4, 5 ->
                        System.out.println("U hebt een niet te onderschatten vorm van digitale verslaving " + naam + ". Leg jezelf wat beperkingen op.");

                case 6, 7, 8 -> {
                        System.out.println("U hebt een ernstige vorm van digitale verslaving " + naam + ". Overweeg om een digitale detox-cursus te volgen!");
                        verslaafd++;
                }

                default ->{
                        System.out.println("U hebt een extreme vorm van digitale verslaving " + naam + ". Je hebt waarschijnlijk professionele hulp nodig!");
                        verslaafd++;
                }
            }
            do {
                System.out.print("Wilt u nog een enquête invullen? ");
                keuze = scan.nextLine();
            } while (!(keuze.toLowerCase().strip()).equals("ja") && !(keuze.toLowerCase().strip()).equals("nee"));
            System.out.println();
        } while ((keuze.toLowerCase().strip()).equals("ja"));

    }



}
