package week9.Dierenrijk;

public class Animals {
    private Animal[] animals = new Animal[100];
    private int amount;

    public Animals() {
        this.amount = 0;
    }

    public void add(Animal animal){
        this.animals[this.amount++] = animal;
    }

    public void show(){
        for (int i = 0; i < amount; i++) {
            System.out.println(this.animals[i]);
            System.out.println();
        }

    }


}
