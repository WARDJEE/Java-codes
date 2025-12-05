package week10.Winkelmandje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingBasket {
    List<OrderLine> orderlines;

    public ShoppingBasket() {
        this.orderlines = new ArrayList<>();
    }

    public void addItem(Item item){
        for (OrderLine line : orderlines) {
            if (line.getItem() == item) {
                line.incrementAmount();
                return;
            }
        }
        orderlines.add(new OrderLine(item, 1));
    }

    public void removeItem(Item item){
        Iterator<OrderLine> iterator = this.orderlines.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getItem() == item) {
                iterator.remove();
            }
        }
    }

    public String getPrice(){
        double totaal = 0;
        for (OrderLine orderLine : this.orderlines){
            totaal += orderLine.getPrice();
        }
        return String.format("%.2f EUR", totaal);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("nummer  beschrijving                            aantal  totaal \n");
        for (OrderLine orderLine : this.orderlines){
            sb.append(orderLine).append("\n");
        }
        return sb.toString();
    }
}
