package week12.Examen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHomeController {
    List<SmartDevice> allSmartDevices;
    Map<String, Integer> rooms = new HashMap<>();

    public SmartHomeController() {
        this.allSmartDevices = new ArrayList<>();
    }

    public void addSmartDevice(SmartDevice smartDevice){
        this.allSmartDevices.add(smartDevice);
        if (rooms.containsKey(smartDevice.getRoom())){
            this.rooms.put(smartDevice.getRoom(), rooms.get(smartDevice.getRoom()) + 1);
        }

        else rooms.put(smartDevice.getRoom(), 1);
    }

    public void turnOnAllDevices(){
        for (SmartDevice smartDevice : allSmartDevices) {
            smartDevice.turnOn();
        }
    }

    public void showSortedById(){
        this.allSmartDevices.sort(new CompareById());
        System.out.println("All smart devices, sorted by id:");
        for (SmartDevice smartDevice : allSmartDevices) {
            System.out.println("   " + smartDevice);
        }
    }

    public void showRooms(){
        System.out.print("All rooms with smartdevices in it (no duplicates!): ");
        List<String> rooms = new ArrayList<>(this.rooms.keySet());
        for (String room  : rooms) {
            System.out.print(room + " ");
        }
        System.out.println();
    }

    public void deviceConsumingMostEnergy(){
        SmartDevice hoogsteVerbruik = allSmartDevices.getFirst();
        for (SmartDevice smartDevice : allSmartDevices) {
            if (smartDevice.getAverageEnergyUsage() > hoogsteVerbruik.getAverageEnergyUsage()){
               hoogsteVerbruik = smartDevice;
            }
        }
        System.out.println("Device consuming most energy: " + hoogsteVerbruik);
    }

    public void checkSensors(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String time = LocalDateTime.now().format(formatter);
        for (SmartDevice smartDevice : allSmartDevices) {
            if (smartDevice instanceof MotionSensor){
                if (((MotionSensor) smartDevice).isMotionDetected()){
                    System.out.println("Motion detected in room " + smartDevice.getRoom() + " at " + time + ((LocalDateTime.now().getHour()<12)? " AM":" PM"));
                }
            }



        }
    }
}
