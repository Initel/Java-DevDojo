package ademy.devdojo.maratonajava.Javacore.Rdatas.test;

import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //objeto zona
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        //Pegar zona do sistema
        System.out.println(ZoneId.systemDefault());

        //Pegando uma zona expecifica
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone + "\n");
        //Data desta zona
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zDTTokyo = now.atZone(tokyoZone);
        System.out.println(zDTTokyo + "\n");

        Instant nowIntant = Instant.now();
        System.out.println(nowIntant);
        ZonedDateTime zDTTokyo2 = nowIntant.atZone(tokyoZone);
        System.out.println(zDTTokyo2 + "\n");

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX + "\n");

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowIntant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3 + "\n");

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);

    }
}
