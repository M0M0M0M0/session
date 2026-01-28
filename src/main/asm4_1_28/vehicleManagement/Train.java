package main.asm4_1_28.vehicleManagement;

public class Train extends Vehicle {
    public Train() {
    }

    public Train(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Train is moving.");
    }
}
