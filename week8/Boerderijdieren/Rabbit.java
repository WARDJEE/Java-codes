package week8.Boerderijdieren;

public class Rabbit extends FarmAnimal{
    private boolean likesDigging;

    public Rabbit(String name, boolean likesDigging){
        super(name, "Snifsnif", "gras");
        this.likesDigging = likesDigging;
    }

    public boolean getLikesDigging() {
        return this.likesDigging;
    }

    public String toString(){
        return String.format("%s en geeft graaft%sgraag.", super.toString(), (this.likesDigging)? " ":" niet ");
    }
}
