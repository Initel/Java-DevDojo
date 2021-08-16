package ademy.devdojo.maratonajava.Javacore.Csobrecargasdemetodos.test;
import ademy.devdojo.maratonajava.Javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hibike! euphonio", "TV", 24, "Seinen", "Kyoto Animation's");
        Anime anime2 = new Anime();

        anime.imprime();
        //System.out.println("-------------");
        //anime2.imprime();
    }
}
