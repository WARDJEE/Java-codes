package week8.Boerderij;

public class FarmAnimal {
    private String name;
    private String sound;
    private String food;

    public FarmAnimal(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    public String getFood() {
        return this.food;
    }

    public String toString(){
        return String.format("%s maakt geluid \"%s\" en eet %s", this.name, this.sound, this.food);
    }
}
