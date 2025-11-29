package week8.Boerderij;

public class Farm{
    private FarmAnimal[] animals;
    private int amountOfAnimals;
    private final int MAX_ANIMALS = 5;

    public Farm() {
        this.animals = new FarmAnimal[MAX_ANIMALS];
        this.amountOfAnimals = 0;
    }

    public void addAnimal(FarmAnimal animal){
        if (this.amountOfAnimals >= this.MAX_ANIMALS){
            System.out.println("Er is geen plaats meer voor " + animal.getName() + ".  De boerderij zit vol!");
        }

        else{
            this.animals[this.amountOfAnimals++] = animal;
        }
    }

    public void showAnimals(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.println(this.animals[i].toString());
        }
    }

    public void showSounds(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.printf("%s maakt geluid \"%s\"", this.animals[i].getName(), this.animals[i].getSound());
            System.out.println();
        }
    }

    public void showFoods(){
        for (int i = 0; i < this.amountOfAnimals; i++) {
            System.out.printf("%s eet %s", this.animals[i].getName(), this.animals[i].getFood());
            System.out.println();
        }
    }

    public FarmAnimal findAnimalByName(String name){
        for(FarmAnimal animal : this.animals){
            if (animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }



}
