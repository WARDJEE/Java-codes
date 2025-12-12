package Peertutoring.Week09_Bakkerij;

import java.time.LocalDate;

public final class Coffee extends Product implements Consumable{
    private boolean vegan;

    public Coffee(String name, double price, LocalDate expirationDate, boolean vegan){
        super(name, price, expirationDate);
        this.vegan = vegan;
    }

    @Override
    public String productInfo() {
        return String.format("Coffee: %s, €%.2f", super.getName(), super.getPrice());
    }

    @Override
    public boolean isExpired(){
        return LocalDate.now().isAfter(super.getExpirationDate());
    }

    public String toString(){
        return super.toString() + ((this.vegan)? " [vegan] ": "");
    }
}
