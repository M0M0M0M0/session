package main.asm4_1_28.vehicleManagement;

public class Plane extends Vehicle {
    public Plane() {
    }

    public Plane(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Plane is moving.");
    }
}
