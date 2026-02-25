package main.session7;

import java.sql.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/t2507e_jp";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString, user, password);
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
//            String name1 = "Nguyen Van D";
//            LocalDate dob1 = LocalDate.of(2000, 11, 11);
//            Integer mark1 = 80;
//            String qr1 = "insert into students (name,dob,mark) VALUES ('"
//                    + name1 + "','"
//                    + dob1 + "',"
//                    + mark1 + ")";
//            stt.executeUpdate(qr1);


            String name2 = "Nguyen Van E";
            LocalDate dob2 = LocalDate.of(1999, 1, 21);
            Integer mark2 = 85;
            String qr2 = "insert into students (name,dob,mark) VALUES (?,?,?)";
            PreparedStatement ps1 = conn.prepareStatement(qr2);
            ps1.setString(1, name2);
            ps1.setDate(2, Date.valueOf(dob2));
            ps1.setInt(3, mark2);
            ps1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
