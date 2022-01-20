package ademy.devdojo.maratonajava.Javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) {
            DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dosFileAttributes.isHidden());
            System.out.println(dosFileAttributes.isReadOnly());

        /*  Files.createFile(path);
            //
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readOnly", true);
            //
            Files.setAttribute(path, "dos:hidden", false);
            Files.setAttribute(path, "dos:readOnly", false);
         */
        }
    }
}
