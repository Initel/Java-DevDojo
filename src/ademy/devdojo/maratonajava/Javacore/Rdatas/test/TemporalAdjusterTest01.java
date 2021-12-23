package ademy.devdojo.maratonajava.Javacore.Rdatas.test;

import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 0;
        switch (dayOfWeek) {
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1; break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(24).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(25).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();

        now = LocalDate.now().withDayOfMonth(26).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
