package Peertutoring.Week9_Bakkerij;

public class Bakery {
    private Product[] products;
    private int count;
    private final int MAX_PRODUCTS = 10;

    public Bakery() {
        this.products = new Product[this.MAX_PRODUCTS];
        this.count = 0;
    }

    public boolean addProduct(Product product){
        if (this.count >= this.MAX_PRODUCTS){
            return false;
        }

        else{this.products[this.count++] = product;
            return true;
        }
    }

    public String toString(){
        StringBuilder producten = new StringBuilder("Bakery products: \n");
        for (int i = 0; i < count; i++) {
            if (products[i] instanceof Coffee) {
                producten.append(products[i]).append("\n");
            }
        }

        // Dan CinnamonRoll
        for (int i = 0; i < count; i++) {
            if (products[i] instanceof CinnamonRoll) {
                producten.append(products[i]).append("\n");
            }
        }
        return producten.toString();
    }
}
