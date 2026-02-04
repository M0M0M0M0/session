package main.asm7;

public class Manager extends Employee implements BonusEligible {
    private int teamSize;

    public Manager() {
    }

    public Manager(String id, String name, double baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.3;
    }

    @Override
    public double baseSalary() {
        return getBaseSalary() + getTeamSize() * 1000000;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }
}
