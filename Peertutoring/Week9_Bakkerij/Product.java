package Peertutoring.Week9_Bakkerij;

import java.time.*;

public abstract class Product implements Consumable{
    private String name;
    private double price;
    private LocalDate expirationDate;
    private static int totalProducts = 0;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        totalProducts++;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public abstract String productInfo();

    @Override
    public String toString(){
        return String.format("%s (expires: %s)", this.name, this.expirationDate);
    }
}
