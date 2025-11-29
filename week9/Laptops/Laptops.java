package week9.Laptops;

public class Laptops {
    private Laptop[] laptops;
    private int amount;

    public Laptops(){
        this.laptops = new Laptop[2000];
        this.amount = 0;
    }

    public void addLaptop(Laptop laptop){
        if (this.amount < this.laptops.length){
            this.laptops[this.amount] = laptop;
            this.amount++;
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public String getLaptop(int index){
        if (index > this.amount){
            return "NULL";
        }

        else
            return this.laptops[index].toString();
    }

    public void printLaptops(){
        System.out.println("Aantal active leden: " + amount);
        for (int i = 0; i < this.amount; i++){
            System.out.println(laptops[i]);
        }
    }
}
