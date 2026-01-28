package main.session4;

import main.session3.Student;

public class Main {
    public static void main(String[] args) {
        Sinhvien s = new Sinhvien();
        s.study();
        FPTStudent fs = new FPTStudent();
        fs.study();
        fs.playGame();
        AptechStudent a = new AptechStudent();
        a.playGame();
        FPTStudent b = new AptechStudent();
        b.playGame();

    }
}
