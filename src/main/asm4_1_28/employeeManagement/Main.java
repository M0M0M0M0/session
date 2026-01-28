package main.asm4_1_28.employeeManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new PartTimeEmployee("Nguyen Van A", "A001", 160.0, 40000.0));
        employees.add(new FullTimeEmployee("Nguyen Van B", "A002", 8000000.0));
        for (Employee e : employees) {
            System.out.println("Luong cua nhan vien " + e.getName() + ", ID: " + e.getId() + " la " + e.getSalary() + " VND");
        }
    }
}
