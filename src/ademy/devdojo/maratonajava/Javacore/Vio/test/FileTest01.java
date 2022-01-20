package ademy.devdojo.maratonajava.Javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado     : " + isCreate);
            System.out.println("Path               : " + file.getPath());
            System.out.println("Path absoluto      : " + file.getAbsolutePath());
            System.out.println("E um diretorio     : " + file.isDirectory());
            System.out.println("E um arquivo       : " + file.isFile());
            System.out.println("Arquivo oculto     : " + file.isHidden());
            System.out.println("Ultima Modificaçao : " + Instant.ofEpochMilli(file.lastModified()).atZone((ZoneId.systemDefault())));

            boolean isExists = file.exists();
            if (isExists){
                boolean isDelete = file.delete();
                System.out.println();
                System.out.println("Arquivo Deletado:    " + isDelete);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
