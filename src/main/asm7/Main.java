package main.asm7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double sumSalary = 0;
        double sumBonus = 0;
        ArrayList<Employee> epl = new ArrayList<>();
        epl.add(new Developer("D001", "Nguyen Van A", 10000.0, 15));
        epl.add(new Developer("D002", "Nguyen Van B", 6000.0, 20));
        epl.add(new Developer("D003", "Nguyen Van C", 8000.0, 6));
        epl.add(new Tester("T001", "Tester 1", 15000.0, 4));
        epl.add(new Tester("T002", "Tester 2", 12000.0, 2));
        epl.add(new Manager("M001", "Manager 1", 25000.0, 5));
        for (Employee e : epl) {
            System.out.println(e.getPosition() + " - ID: " + e.getId() + " - Name: " + e.getName() + " - Base salary: " + e.getBaseSalary());
            System.out.print("Salary: " + e.caculateSalary());
            if (!(e instanceof Tester)) {
                BonusEligible bn = (BonusEligible) e;
                System.out.println(" - Bonus: " + bn.calculateBonus());
                sumBonus += bn.calculateBonus();
            }
            sumSalary += e.caculateSalary();
        }
        System.out.println(" ");
        System.out.println("Tong luong phai tra cho cong ty la " + sumSalary);
        System.out.println("Tong tien thuong phai tra cho cong ty la " + sumBonus);


    }
}
