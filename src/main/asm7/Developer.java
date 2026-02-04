package main.asm7;

public class Developer extends Employee implements BonusEligible {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(String id, String name, double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary() * 0.2;
    }

    @Override
    public double baseSalary() {
        return getBaseSalary() + getOvertimeHours() * 50000;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }
}
