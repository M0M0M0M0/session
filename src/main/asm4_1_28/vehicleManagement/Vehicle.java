package main.asm4_1_28.vehicleManagement;

public class Vehicle {
    private String name;
    private Integer maxSpeed;

    public Vehicle() {
    }

    public Vehicle(String name, Integer maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Vehicle is moving.");
    }
}
