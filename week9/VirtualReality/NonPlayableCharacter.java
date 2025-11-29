package week9.VirtualReality;

import java.util.Random;

public class NonPlayableCharacter extends Entity implements Alive, Visible{
    public int numberOfLives;

    public NonPlayableCharacter(String name, double[] position, int lives){
        super(name, position);
        this.numberOfLives = (lives < 1)? 1:lives;
    }

    public void kill(){
        if (this.numberOfLives != 0){
            System.out.println(super.name + ": Aaaaaaarrrrrrgggghhh");
            this.numberOfLives--;
        }
        if (this.numberOfLives == 0){
            System.out.println(super.name + " is dood.");
        }
    }

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void animate(){
        Random random = new Random(42);
        for (int i = 0; i < 3; i++) {
            super.position[i] += random.nextInt(-10, 11);
        }
    }

    @Override
    public void draw() {
        System.out.println("Non playable character: " + super.toString());
    }
}
