package week10.Verjaardagen;

import java.time.Period;

public class Person implements Comparable<Person>{
    private String name;
    private Birthday birthday;

    public Person(String name, Birthday birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name, int day, Month month) {
        this.name = name;
        birthday = new Birthday(day, month);
    }

    public String getName() {
        return this.name;
    }

    public Birthday getBirthday() {
        return this.birthday;
    }

    public String toString(){
        return String.format("%-7s -> %s", this.name, this.birthday.toString());
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
}
