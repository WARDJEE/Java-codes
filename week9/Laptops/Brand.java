package week9.Laptops;

public enum Brand {
    ACER, APPLE, ASUS, DELL, HP, LENOVO, MEDION, TOSHIBA;

    public String toString(){
        String brand = name().toLowerCase().replace("_", " ");
        return name().charAt(0) + brand.substring(1);
    }
}
