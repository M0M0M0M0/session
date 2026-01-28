package main.asm4_1_28.employeeManagement;

public class FullTimeEmployee extends Employee {
    private Double fixedSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, String id, Double fixedSalary) {
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public Double getSalary() {
        return getFixedSalary();
    }
}
