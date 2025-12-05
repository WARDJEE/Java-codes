package week10.Acteurs;

import java.util.*;

public class TestActor {
    private static final Actor[] testdata = {
            new Actor("Cameron Diaz", 1972),
            new Actor("Anna Faris", 1976),
            new Actor("Angelina Jolie", 1975),
            new Actor("Jennifer Lopez", 1970),
            new Actor("Reese Witherspoon", 1976),
            new Actor("Neve Campbell", 1973),
            new Actor("Catherine Zeta-Jones", 1969),
            new Actor("Kirsten Dunst", 1982),
            new Actor("Kate Winslet", 1975),
            new Actor("Gina Philips", 1975),
            new Actor("Shannon Elisabeth", 1973),
            new Actor("Carmen Electra", 1972),
            new Actor("Drew Barrymore", 1975),
            new Actor("Elisabeth Hurley", 1965),
            new Actor("Tara Reid", 1975),
            new Actor("Katie Holmes", 1978),
            new Actor("Anna Faris", 1976)
    };

    static void main() {
        Actor reese = new Actor("Reese Witherspoon", 1976);
        Actor drew = new Actor("Drew Barrymore", 1975);
        Actor anna = new Actor("Anna Faris", 1976);
        Actor thandie = new Actor("Thandie Newton", 1972);

        List<Actor> actors = new ArrayList<>();
        actors.addAll(Arrays.asList(testdata));
        actors.add(reese);
        actors.add(drew);
        actors.add(anna);
        actors.add(thandie);

        // Toon de inhoud van de collection (zonder iterator)
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        // Verwijder de objecten reese en thandie
        actors.remove(reese);
        actors.remove(thandie);

        // Verwijder alle acteurs geboren in 1975 (met iterator)
        Iterator<Actor> it = actors.iterator();
        while (it.hasNext()) {
            if (it.next().getBirthYear() == 1975) {
                it.remove();
            }
        }
        // Verwijder alle dubbele acteurs in de lijst (doe dit bijvoorbeeld door een
        // nieuwe lijst te maken zonder dubbels.  Je kan “contains” gebruiken om te
        // kijken of een element al in de lijst zit)
        ArrayList<Actor> zonderDubbels = new ArrayList<>();
        for (Actor actor : actors) {
            if (!zonderDubbels.contains(actor)){
                zonderDubbels.add(actor);
            }
        }


        // Sorteer volgens geboortejaar (oudste eerst) en dan volgens voornaam
        Collections.sort(zonderDubbels);


        System.out.println("\nUiteindelijke inhoud:\n");
        // Toon de inhoud van de collection (met iterator of foreach)
        for (Actor zonderDubbel : zonderDubbels) {
            System.out.println(zonderDubbel);
        }




    }
}