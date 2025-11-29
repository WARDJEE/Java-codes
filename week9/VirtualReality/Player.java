package week9.VirtualReality;

import java.util.Random;

public class Player extends Entity implements Alive, Visible{
    public int numberOfLives;

    public Player(String name, double[] position, int lives){
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

    @Override
    public void draw() {
        System.out.println("Player: " + super.toString());
    }
}
