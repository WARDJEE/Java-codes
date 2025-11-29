package week9.Laptops;

public enum CpuType {
    I3, I5, I7;

    public String toString(){
        return name().replace("I", "i");
    }
}
