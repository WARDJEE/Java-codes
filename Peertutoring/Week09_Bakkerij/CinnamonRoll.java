package Peertutoring.Week09_Bakkerij;

import java.time.LocalDate;

public class CinnamonRoll extends Product implements Consumable{
    Topping topping;

    public CinnamonRoll(String name, double price, LocalDate expirationDate, Topping topping){
        super(name, price, expirationDate);
        this.topping = topping;
    }

    @Override
    public String productInfo() {
        return String.format("CinnamonRoll: %s met topping %s, €%.2f", super.getName(), this.topping.toString(),super.getPrice());
    }

    @Override
    public boolean isExpired(){
        return LocalDate.now().isAfter(super.getExpirationDate().plusDays(2));
    }

    public String toString(){
        return String.format("%s (expires: %s) [topping: %s]", this.getName(), this.getExpirationDate(), this.topping.toString());
    }
}
