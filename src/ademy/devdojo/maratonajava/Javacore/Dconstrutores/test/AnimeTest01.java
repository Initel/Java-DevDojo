package ademy.devdojo.maratonajava.Javacore.Dconstrutores.test;
import ademy.devdojo.maratonajava.Javacore.Csobrecargasdemetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.init("Akudama Drive","TV",12);
        anime2.init("Hibike! euphonio","TV",24, "Seinen");

        anime.imprime();
        System.out.println("-------------");
        anime2.imprime();
    }
}
