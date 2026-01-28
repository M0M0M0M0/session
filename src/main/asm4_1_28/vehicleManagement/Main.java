package main.asm4_1_28.vehicleManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Plane("Plane1", 1200));
        vehicles.add(new Car("Car1", 250));
        vehicles.add(new Bike("Bike1", 300));
        vehicles.add(new Train("Train", 80));
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
