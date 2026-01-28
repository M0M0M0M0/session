package main.asm4_1_28.employeeManagement;

public class PartTimeEmployee extends Employee {
    private Double workedHours;
    private Double salaryRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, String id, Double workedHours, Double salaryRate) {
        super(name, id);
        this.workedHours = workedHours;
        this.salaryRate = salaryRate;
    }

    public Double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Double workedHours) {
        this.workedHours = workedHours;
    }

    public Double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(Double salaryRate) {
        this.salaryRate = salaryRate;
    }

    @Override
    public Double getSalary() {
        return getSalaryRate() * getWorkedHours();
    }
}
