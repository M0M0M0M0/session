package main.session3;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("SV001", "Nguyen Van A", 20, 9.0);
//        Student s2 = new Student("SV002", "Nguyen Van B", 19, 8.0);
//        s1.inThongTin();
//        s2.inThongTin();


        TaiKhoan tk1 = new TaiKhoan("123456", 1000, "Nguyen Van A");
        tk1.hienThiSoDu();
        tk1.napTien(100);
        tk1.hienThiSoDu();
    }


}
