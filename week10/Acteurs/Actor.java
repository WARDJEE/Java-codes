package week10.Acteurs;

import java.time.LocalDate;
import java.util.Objects;

public class Actor implements Comparable <Actor> {
    private String name;
    private int birthYear;

    public Actor(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actor actor)) return false;
        return birthYear == actor.birthYear && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }

    @Override
    public String toString() {
        return this.birthYear + " " +this.name;
    }

    @Override
    public int compareTo(Actor actor) {
        int datum = this.birthYear - actor.getBirthYear();
        if (datum != 0) {
            return datum;
        }
        return this.name.compareTo(actor.getName());
    }
}
