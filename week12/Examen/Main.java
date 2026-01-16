package week12.Examen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Deel 1");
        MotionSensor sensor1 = new MotionSensor("sensor1", "Hall", DeviceType.SENSOR);
        MotionSensor sensor2 = new MotionSensor("sensor2", "LivingRoom", DeviceType.SENSOR);
        SmartLight light1 = new SmartLight("light1", "LivingRoom", DeviceType.LIGHT,25);
        SmartLight light2 = new SmartLight("light2", "Kitchen", DeviceType.LIGHT,40);

        sensor2.setMotionDetected(true);

        SmartDevice[] demotica = {sensor1, sensor2, light1, light2};

        for (SmartDevice smartDevice : demotica) {
            System.out.println(smartDevice);
        }

        System.out.println();
        System.out.println("Deel 2");
        SmartHomeController smartHomeController = new SmartHomeController();
        for (SmartDevice smartDevice : demotica) {
            smartHomeController.addSmartDevice(smartDevice);
        }

        smartHomeController.turnOnAllDevices();
        smartHomeController.showSortedById();

        System.out.println();
        System.out.println("Deel 3");
        smartHomeController.showRooms();
        smartHomeController.deviceConsumingMostEnergy();
        sensor2.setMotionDetected(true);
        smartHomeController.checkSensors();

    }
}
