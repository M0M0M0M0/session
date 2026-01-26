package main.session3;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTaiKhoan, double soDu, String tenChuTK) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.tenChuTK = tenChuTK;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }

    public void setTenChuTK(String tenChuTK) {
        this.tenChuTK = tenChuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien <= 0) System.out.println("Hay nhap so tien hop le.");
        else setSoDu(getSoDu() + soTien);
    }

    public void rutTien(double soTien) {
        if (getSoDu() < soTien) System.out.println("Not enough money.");
        else if (soTien <= 0) {
            System.out.println("Hay nhap so tien hop le.");
        } else setSoDu(getSoDu() - soTien);
    }

    public void hienThiSoDu() {
        System.out.println("So du hien tai la " + getSoDu());
    }
}
