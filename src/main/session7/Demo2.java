package main.session7;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/t2507e_jp";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString, user, password);

            //Nhap thong tin
            String name1;
            LocalDate dob1;
            Integer mark1;

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten sinh vien:");
            name1 = sc.nextLine();
            System.out.println("Nhap lan luot: Nam sinh, thang sinh va ngay sinh:");
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            dob1 = LocalDate.of(year, month, day);
            System.out.println("Nhap diem cua sinh vien:");
            mark1 = sc.nextInt();

            //Insert thong tin
            String qr1 = "insert into students (name,dob,mark) VALUES (?,?,?)";
            PreparedStatement ps1 = conn.prepareStatement(qr1);
            ps1.setString(1, name1);
            ps1.setDate(2, Date.valueOf(dob1));
            ps1.setInt(3, mark1);
            ps1.executeUpdate();

            //lay thong tin sinh vien
            String sql = "select * from students";
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(sql);

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                LocalDate dob = rs.getDate("dob").toLocalDate();
                Integer mark = rs.getInt("mark");
                System.out.println(id + "--" + name + "--" + dob + "--" + mark);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
