package main.asm1_26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product p1 = new ElectronicProduct("E01", "Laptop Dell", 15000000, 24);
        Product p2 = new ElectronicProduct("E02", "iPhone 13", 22000000, 12);
        Product p3 = new ElectronicProduct("E03", "Tai nghe Bluetooth", 2500000, 6);
        Product p4 = new ElectronicProduct("E04", "Màn hình LG", 8000000, 18);
        Product p5 = new ElectronicProduct("E05", "Chuột gaming", 1200000, 12);
        Product p6 = new FoodProduct("F01", "Sữa tươi", 30000, 2);
        Product p7 = new FoodProduct("F02", "Bánh mì", 15000, 1);
        Product p8 = new FoodProduct("F03", "Mì gói", 5000, 10);
        Product p9 = new FoodProduct("F04", "Trứng gà", 35000, 5);
        Product p10 = new FoodProduct("F05", "Rau cải", 20000, 7);
        Product p11 = new ClothingProduct("C01", "Áo thun", 200000, "M");
        Product p12 = new ClothingProduct("C02", "Quần jeans", 450000, "L");
        Product p13 = new ClothingProduct("C03", "Áo khoác", 650000, "XL");
        Product p14 = new ClothingProduct("C04", "Váy nữ", 500000, "S");
        Product p15 = new ClothingProduct("C05", "Áo sơ mi", 350000, "M");
        Collections.addAll(products, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);

        p2.getInfo();
        System.out.println("Gia da giam: " + p2.calculateDiscountedPrice());
        p6.getInfo();
        System.out.println("Gia da giam: " + p6.calculateDiscountedPrice());
        p12.getInfo();
        System.out.println("Gia da giam: " + p12.calculateDiscountedPrice());
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }
}
