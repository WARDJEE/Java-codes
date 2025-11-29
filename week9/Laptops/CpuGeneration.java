package week9.Laptops;

public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    public String toString(){
        String generation = name().toLowerCase().replace("_", " ");
        return name().charAt(0) + generation.substring(1);
    }
}
