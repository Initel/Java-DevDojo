package ademy.devdojo.maratonajava.Javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("DevDojo o que me fez querer programar para valer\n");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
;