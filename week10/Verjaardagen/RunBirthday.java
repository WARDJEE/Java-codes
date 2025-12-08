package week10.Verjaardagen;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RunBirthday {
    static void main() {
        Person[] data = {
                new Person("Jeremy",  new Birthday(16, Month.MEI)),
                new Person("Bo",      new Birthday( 9, Month.DECEMBER)),
                new Person("Evelyne", new Birthday(15, Month.AUGUSTUS)),
                new Person("Jeremy",  new Birthday(23, Month.AUGUSTUS)),
                new Person("Divine",  new Birthday(25, Month.APRIL)),
                new Person("Ayoub",   new Birthday(15, Month.AUGUSTUS)),
                new Person("Jeremy",  new Birthday( 3, Month.AUGUSTUS)),
                new Person("Divine",  new Birthday(10, Month.APRIL))
        };
        List<Person> persons = new ArrayList<Person>(Arrays.asList(data));
        showPersons(persons);

        // Sorteer personen in volgorde van de kalender
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).getBirthday().compareTo(persons.get(j).getBirthday()) > 0) {
                    Person eerstePersoon = persons.get(i);
                    persons.set(i, persons.get(j));
                    persons.set(j, eerstePersoon);
                }
            }
        }

        System.out.println("\nGesorteerd op verjaardag:");
        showPersons(persons);
        // Sorteer personen alfabetisch
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).compareTo(persons.get(j)) > 0) {
                    Person eerstePersoon = persons.get(i);
                    persons.set(i, persons.get(j));
                    persons.set(j, eerstePersoon);
                }
            }
        }


        System.out.println("\nGesorteerd op naam:");
        showPersons(persons);
    }

    private static void showPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
