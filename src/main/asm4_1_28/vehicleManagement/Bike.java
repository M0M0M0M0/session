package main.asm4_1_28.vehicleManagement;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Bike is moving.");
    }
}
