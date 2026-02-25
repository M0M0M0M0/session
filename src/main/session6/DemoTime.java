package main.session6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoTime {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(3650);
        System.out.println(ld2);
        LocalDate ld3 = ld1.minusYears(1);
        System.out.println(ld3);
        LocalDate ld4 = LocalDate.parse("2026-05-19");
        LocalDate ld5 = ld4.plusMonths(12);
        LocalDate ld6 = LocalDate.of(2026, 2, 19);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDate dob = LocalDate.of(2002, 10, 29);
        System.out.println(dob.getDayOfWeek());
        LocalDate bdob = dob.minusMonths(9).minusDays(10);
        System.out.println(bdob + " " + bdob.getDayOfWeek());
    }
}
