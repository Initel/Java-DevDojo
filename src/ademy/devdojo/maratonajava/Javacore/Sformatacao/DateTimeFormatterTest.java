package ademy.devdojo.maratonajava.Javacore.Sformatacao;

import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //DateFormat para String
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String[] sS = {s1, s2, s3};

        for (String ssS: sS) {
            System.out.println(ssS);
        }

        System.out.println();

        //String para DateFormat
        LocalDate parse1 = LocalDate.parse("20211224", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-12-24+03:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-12-24", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println();

        //Conversao da hora do momento em String
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-12-24T18:26:51.958450117");
        System.out.println(parse4);

        System.out.println();

        //Mudado a ordem da formataçao
        //dd//MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("24/12/2021", formatterBR);
        System.out.println(parseBR);

        System.out.println();

        //
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("24.Dezember.2021", formatterGR);
        System.out.println(parseGR);
    }
}
