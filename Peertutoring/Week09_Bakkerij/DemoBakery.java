package Peertutoring.Week09_Bakkerij;

import java.time.LocalDate;
public class DemoBakery {
    public static void main(String[] args) {
        LocalDate fixedDate = LocalDate.of(2025, 1, 15);
        Bakery bakery = new Bakery();

        bakery.addProduct(new Coffee("Espresso", 2.50,
                fixedDate.plusDays(1), true));
        bakery.addProduct(new Coffee("Latte", 3.20,
                fixedDate.minusDays(1), false));
        bakery.addProduct(new Coffee("Cappuccino", 3.00,
                fixedDate.plusDays(5), false));
        bakery.addProduct(new Coffee("Americano", 2.80,
                fixedDate.minusDays(10), true));

        bakery.addProduct(new CinnamonRoll("Sweet Roll", 4.10,
                fixedDate, Topping.CHOCOLATE));
        bakery.addProduct(new CinnamonRoll("Cinnamon Blast", 3.80,
                fixedDate.minusDays(3), Topping.CINNAMON));
        bakery.addProduct(new CinnamonRoll("Almond Swirl", 4.50,
                fixedDate.plusDays(2), Topping.ALMOND));
        bakery.addProduct(new CinnamonRoll("Old Roll", 3.00,
                fixedDate.minusDays(5), Topping.PLAIN));
        System.out.println(bakery);
        System.out.println("Total products created: " + Product.getTotalProducts());
    }
}

