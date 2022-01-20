package ademy.devdojo.maratonajava.Javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args){
        Path dirAbsolute = Paths.get("/home/diego");
        Path clazz = Paths.get("/home/diego/dev/helloWord/dd1205.java");
        Path pathToClazz = dirAbsolute.relativize(clazz);
        System.out.println(pathToClazz);
        System.out.println();

        Path absoluto1 = Paths.get("/home/diego");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/diego/dev/helloWord/dd1205.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.170120220730");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("4 " + relativo1.relativize(relativo2));

    }
}
