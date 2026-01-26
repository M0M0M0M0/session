package main.session2;

public class Car {
    //attribute
    String brand; //class variable
    int year;


    public Car() { //Ham khoi tao khong tham so
        System.out.println("Ham nay chay moi khi doi tuong duoc tao (Chay tu dong).");
    }

    public Car(String brand, Integer year) {
        System.out.println("123456...");
        this.brand = brand;
        this.year = year;
    }


    //method - behavior
    public void run() {
        System.out.println("Car is running...");
    }

    public void maintain() {
        System.out.println("Car is being maintained.");
    }

    public void checkdate() {
        int now = 2026;
        int yearp = this.year;
        if (yearp + 10 < 2026) System.out.println("Car is expired");
        else System.out.println("Car is not expired");
    }

}
