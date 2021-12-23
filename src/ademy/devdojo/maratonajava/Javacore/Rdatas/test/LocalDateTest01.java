package ademy.devdojo.maratonajava.Javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args){
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.DECEMBER.getValue());
        LocalDate date = LocalDate.of(2022, Month.DECEMBER,31);
        LocalDate agora = LocalDate.now();

        System.out.println();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        //TESTE
    }
}
