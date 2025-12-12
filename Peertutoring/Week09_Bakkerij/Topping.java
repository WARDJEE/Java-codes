package Peertutoring.Week09_Bakkerij;

public enum Topping {
    CHOCOLATE, CINNAMON, ALMOND, PLAIN;

    public String toString(){
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
