package ademy.devdojo.maratonajava.Javacore.Sformatacao;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        Paises();
    }

    public static void Paises(){
        System.out.println(Locale.getDefault());
        System.out.println();
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }
    }
}
