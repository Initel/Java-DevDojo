package ademy.devdojo.maratonajava.Javacore.Wnio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01{
    public static void main(String[] args) {
        String diretorioProjeto = "home/diego/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println("---------------------------");
        System.out.println(path1.normalize());
        System.out.println("---------------------------");
        System.out.println(Files.exists(path1));
        System.out.println("");
        Path path2 = Paths.get("home/./diego/./dev");
        System.out.println(path2);
        System.out.println("---------------------------");
        System.out.println(path2.normalize());
        System.out.println("---------------------------");
        System.out.println(Files.exists(path2));
    }
}
