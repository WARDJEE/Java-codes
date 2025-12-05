package week10.Winkelmandje;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{
    private String title;
    private List<String> actors = new ArrayList<>();

    public Movie(String id, double price, String title, String actor) {
        super(id, price);
        this.title = title;
        this.actors.add(actor);
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getActors() {
        return this.actors;
    }

    public void addActor(String actor){
        this.actors.add(actor);
    }

    public String toString(){
        String acteursString = "";
        for (int i = 0; i < this.actors.size(); i++) {
            acteursString += this.actors.get(i);
            if (i < this.actors.size() - 1) {
                acteursString += ", ";
            }
        }
        return String.format("%-7s \"%s\" (%s)", super.getId(), this.title, acteursString);
    }
}
