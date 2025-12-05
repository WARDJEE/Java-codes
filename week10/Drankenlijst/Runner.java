package week10.Drankenlijst;

public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addDrink(new Drink("La Chouffe", 3.50, true));
        menu.addDrink(new Drink("Coca Cola", 2.00, false));
        menu.addDrink(new Drink("Spa Sparkling", 2.00, false));
        menu.addDrink(new Drink("Spa Still", 2.00, false));
        menu.addDrink(new Drink("Coca Cola Light", 2.00, false));
        menu.addDrink(new Drink("Coffee", 2.50, false));
        menu.addDrink(new Drink("Tea", 2.50, false));
        menu.addDrink(new Drink("Pils", 2.00, true));
        menu.addDrink(new Drink("Duvel", 3.50, true));
        menu.addDrink(new Drink("Orval", 4.00, true));

        System.out.println(menu);

        System.out.println("Our menu contains " + menu.getSize() + " drinks");

        System.out.println("with a total cost of €" + menu.getTotalPrice());

        System.out.println("Our most expensive drink is: " + menu.mostExpensiveDrink());

        System.out.println("Our alcoholic drinks are: " + menu.getAlcoholicDrinks());

        menu.removeMoreExpensiveThen(3.00);
        System.out.println("Menu without drinks above €3: " + menu);

        Drink[] newDrinks = {
                new Drink("Bushmills 10yr", 7.00, true),
                new Drink("SpringBank 5yr", 5.00, true)
        };
        menu.addDrinks(newDrinks);
        System.out.println("Extended menu: " + menu);

        // Drankenlijst sorteren
        menu.sort();

        System.out.println();
        System.out.println("Sorted menu: ");
        System.out.println(menu);
    }
}
