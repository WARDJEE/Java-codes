package week9.Laptops;

public class Laptop {
    private String owner;
    private CpuGeneration cpuGeneration;
    private CpuType cpuType;
    private int ram, disk;
    private Brand brand;

    public Laptop(String owner, CpuGeneration cpuGeneration, CpuType cpuType, int ram, int disk, Brand brand) {
        this.owner = owner;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.brand = brand;
    }

    public String getOwner() {
        return this.owner;
    }

    public CpuGeneration getCpuGeneration() {
        return this.cpuGeneration;
    }

    public CpuType getCpuType() {
        return this.cpuType;
    }

    public int getRam() {
        return this.ram;
    }

    public int getDisk() {
        return this.disk;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public String toString(){
        String brand = (this.brand == null) ? "Onbekend merk" : this.brand.toString();
        String generation = (this.cpuGeneration == null) ? "Onbekend generation" : this.cpuGeneration.toString();
        String type = (this.cpuType == null) ? "Onbekend type" : this.cpuType.toString();



        return String.format("Laptop van %s: %s (%s %s), %dGB, %dGB",
                this.owner, brand,type, generation, this.ram, this.disk);
    }
}
