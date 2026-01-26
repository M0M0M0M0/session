package main.session3;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh() {
    }

    public HocSinh(String hoTen, double diemAnh, double diemVan, double diemToan) {
        setHoTen(hoTen);
        setDiemAnh(diemAnh);
        setDiemToan(diemToan);
        setDiemVan(diemVan);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        if (diemToan >= 0 && diemToan <= 10) this.diemToan = diemToan;
        else System.out.println("Diem khong hop le.");
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        if (diemVan >= 0 && diemVan <= 10) this.diemVan = diemVan;
        else System.out.println("Diem khong hop le.");
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        if (diemAnh >= 0 && diemAnh <= 10) this.diemAnh = diemAnh;
        else System.out.println("Diem khong hop le.");
    }

    public double tinhDiemTB() {
        return (diemAnh + diemToan + diemVan) / 3;
    }

    public String xepLoai() {
        if (tinhDiemTB() >= 8) return "Gioi";
        else if (tinhDiemTB() >= 6.5) {
            return "Kha";
        } else if (tinhDiemTB() >= 5) {
            return "Trung binh";
        } else return "Yeu";
    }
}
