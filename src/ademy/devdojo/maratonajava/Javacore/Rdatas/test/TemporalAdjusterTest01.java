package ademy.devdojo.maratonajava.Javacore.Rdatas.test;

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
        int addDias = 0;
        switch (dayOfWeek){
            case THURSDAY:
                addDias = 4;
                break;

            case FRIDAY:
                addDias = 3;
                break;
                
            case SATURDAY:
                addDias = 2;
                break;
                
            default:
                addDias = 1;
                break;
        }
        return temporal.plus(addDias, ChronoUnit.DAYS);
    }


}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now.with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
