package ademy.devdojo.maratonajava.Javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Shingeki no Kyojin");
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Shigatsu Wa Kimi No uso");
        mangas.add("Pokemon");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(21.98);
        dinheiros.add(784.32);
        dinheiros.add(1313.13);

        Collections.sort(dinheiros);

        for (String manga: mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }
}
