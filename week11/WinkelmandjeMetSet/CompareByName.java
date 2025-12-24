package week11.WinkelmandjeMetSet;

import java.util.Comparator;

public class CompareByName implements Comparator<OrderLine> {
    public int compare(OrderLine o1, OrderLine o2){
        String title1 = (o1.getItem() instanceof Book)? ((Book) o1.getItem()).getTitle():((Movie) o1.getItem()).getTitle();
        String title2 = (o2.getItem() instanceof Book)? ((Book) o2.getItem()).getTitle():((Movie) o2.getItem()).getTitle();

        return title1.compareTo(title2);
        // return ((o1.getItem() instanceof Book)? ((Book) o1.getItem()).getTitle():((Movie) o1.getItem()).getTitle()).compareTo((o2.getItem() instanceof Book)? ((Book) o2.getItem()).getTitle():((Movie) o2.getItem()).getTitle());
    }
}
