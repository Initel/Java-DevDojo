package ademy.devdojo.maratonajava.Javacore.Ycolecoes.test;

import ademy.devdojo.maratonajava.Javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Shingeki no Kyojin", 19.9));
        mangas.add(new Manga(3L,"Berserk", 9.5));
        mangas.add(new Manga(2L,"Hellsing", 7.8));
        mangas.add(new Manga(1L,"Shigatsu Wa Kimi No uso", 25.6));
        mangas.add(new Manga(4L,"Pokemon", 5.5));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------------------------------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
