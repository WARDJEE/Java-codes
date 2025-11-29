package week9.Werknemers;

public class TestEmployees {
    static void main() {
        Employee[] employees = {
                new HourlyWorker("Jos", 57082332149L, 38),
                new HourlyWorker("Yousri", 61030350468L, 40),
                new SalariedEmployee("Sanae", 54110774131L, 1.6)
        };

        // vul hier aan
        double lonen = 0;

        for (Employee employee : employees){
            System.out.println(employee);
            System.out.println();
            lonen += employee.getWages();
        }
        System.out.printf("Som lonen: %.2f€", lonen);
    }
}
