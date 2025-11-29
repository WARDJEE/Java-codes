package week8.Model;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Naam: " + this.name;
    }
}
