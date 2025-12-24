package projects;

import java.util.Scanner;
import java.util.Locale;

public class ShoppingCard {
    static void main() {
        String food;
        double price;
        int quantity;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.UK);
        System.out.print("Enter the food name: ");
        food = scan.nextLine();

        System.out.print("Enter the price: ");
        price = scan.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();

        scan.close();

        System.out.println();
        double total = quantity * price;
        if(quantity > 1){
            System.out.println("You bought " + quantity + " " + food + "s for €" + total + ".");
        }
        else{
            System.out.println("You bought " + quantity + " " + food + " for €" + total + ".");
        }
    }
}

