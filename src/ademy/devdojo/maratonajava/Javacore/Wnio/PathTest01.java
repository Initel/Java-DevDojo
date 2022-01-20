package ademy.devdojo.maratonajava.Javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
         Path p1 = Paths.get("/home/initeli/Documentos/Intellij-projetos/Java-DevDojo/pasta2/arquivo_renomeado.txt");
         Path p2 = Paths.get("/home/initeli/Documentos/Intellij-projetos/Java-DevDojo/pasta2/","arquivo_renomeado.txt");
         Path p3 = Paths.get("/home/initeli/Documentos/", "Intellij-projetos/Java-DevDojo/pasta2/","arquivo_renomeado.txt");
         Path p4 = Paths.get("/home/initeli/", "Documentos/Intellij-projetos/Java-DevDojo/pasta2/arquivo_renomeado.txt");

         System.out.println(p1.getFileName());
         System.out.println(p2.getFileName());
         System.out.println(p3.getFileName());
         System.out.println(p4.getFileName());
    }
}
