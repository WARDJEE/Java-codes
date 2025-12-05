package week10.Winkelmandje;

import java.util.ArrayList;
import java.util.List;

public class Book extends Item{
    private String title;
    private List<String> authors = new ArrayList<>();

    public Book(String id, double price, String title, String authors) {
        super(id, price);
        this.title = title;
        this.authors.add(authors);
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public void addAuthor(String author){
        this.authors.add(author);
    }

    public String toString(){
        String auteursString = "";
        for (int i = 0; i < this.authors.size(); i++) {
            auteursString += this.authors.get(i);
            if (i < this.authors.size() - 1) {
                auteursString += ", ";
            }
        }
        return String.format("%-7s \"%s\" (%s)", super.getId(), this.title, auteursString);
    }
}
