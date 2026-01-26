package main.session3;

public class Student {
    private String maSV;
    private String name;
    private int tuoi;
    private double diemTB;

    public Student() {
    }

    public Student(String maSV, String name, int tuoi, double diemTB) {
        this.maSV = maSV;
        this.name = name;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inThongTin() {
        System.out.println("Ma Sinh Vien: " + maSV + " - Ten: " + name + " - " + tuoi + " tuoi - Diem TB: " + diemTB);
    }

}
