package main.asm4_1_28.vehicleManagement;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}
