package ademy.devdojo.maratonajava.Javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 14);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
//
        System.out.println();
//
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.SECOND_OF_DAY));
//
        System.out.println();
//
        System.out.println("Horario maximo" + LocalTime.MAX);
        System.out.println("Horario minimo" + LocalTime.MIN);

    }
}
