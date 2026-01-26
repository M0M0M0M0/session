package main.session2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.brand = "Toyota";
//        c.year = 2000;
//        c.run();
//        c.maintain();
//        System.out.println("Hang xe cua c: " + c.brand);
//        c.checkdate();
//        Car b = new Car("BMW", 2009);
//        System.out.println("Hang xe cua b: " + b.brand + " " + b.year);


//        System.out.println("Nhap lan luot 3 canh cua tam giac:");
//        System.out.print("x=");
//        Scanner s1 = new Scanner(System.in);
//        float x = s1.nextFloat();
//
//        System.out.print("y=");
//        float y = s1.nextFloat();
//
//        System.out.print("z=");
//        float z = s1.nextFloat();
//
//        Triangle t1 = new Triangle(x, y, z);
//
//        System.out.println("Chu vi tam giac la " + t1.chuVi());
//        System.out.println("Dien tich tam giac la " + t1.dienTich());


        System.out.println("Nhap phan so thu nhat:");
        Scanner s1 = new Scanner(System.in);
        System.out.print("Tu so = ");
        int tuSo1 = s1.nextInt();
        System.out.print("Mau so = ");
        int mauSo1 = s1.nextInt();
        Fraction f1 = new Fraction(tuSo1, mauSo1);
        System.out.println("Nhap phan so thu hai:");
        System.out.print("Tu so = ");
        int tuSo2 = s1.nextInt();
        System.out.print("Mau so = ");
        int mauSo2 = s1.nextInt();
        Fraction f2 = new Fraction(tuSo2, mauSo2);

        f1.add(f2);
        f1.subtract(f2);
        f1.multiply(f2);
        f1.divine(f2);
    }
}
