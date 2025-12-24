package projects;
import java.util.Scanner;
import java.util.Random;
public class HigherLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int tries = 0;
        int number = random.nextInt(1, 101);
        int guess;

        do{
            System.out.print("Enter a guess (1, 100): ");
            guess = scan.nextInt();
            if (guess > number){
                System.out.println("Lower!");
            }

            else if (guess < number) {
                System.out.println("Higher!");
            }
            tries++;

        }while (guess != number);
        System.out.println("Gongrats, you guessed the number " + number + " in " + tries + " tries.");
    }
}
