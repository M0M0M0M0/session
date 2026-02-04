package main.asm7;

public class Tester extends Employee {
    private int bugsFound;

    public Tester() {
    }

    public Tester(String id, String name, double baseSalary, int bugsFound) {
        super(id, name, baseSalary);
        this.bugsFound = bugsFound;
    }

    public int getBugsFound() {
        return bugsFound;
    }

    public void setBugsFound(int bugsFound) {
        this.bugsFound = bugsFound;
    }

    @Override
    public double caculateSalary() {
        return getBaseSalary() + getBugsFound() * 30;
    }

    @Override
    public String getPosition() {
        return "Tester";
    }
}
