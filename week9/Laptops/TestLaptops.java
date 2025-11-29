package week9.Laptops;

import static week9.Laptops.Brand.*;
import static week9.Laptops.CpuGeneration.*;
import static week9.Laptops.CpuType.*;

public class TestLaptops {
    static void main() {
        Laptops laptops = new Laptops();
        laptops.addLaptop(new Laptop("Kris", IVY_BRIDGE, I7, 16, 256, APPLE));
        laptops.addLaptop(new Laptop("Paulien", HASWELL, I3, 8, 128, TOSHIBA));
        laptops.addLaptop(new Laptop("Kay", BROADWELL, I5, 16, 512, ACER));
        laptops.addLaptop(new Laptop("Divine", KABYLAKE, I5, 32, 1024, DELL));
        laptops.addLaptop(new Laptop("Mohamed", KABYLAKE, null, 16, 512, null));

        laptops.printLaptops();
    }
}
