package ademy.devdojo.maratonajava.Javacore.Wnio;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Criar pastas e subPastas
        Path pastaPath = Paths.get("pasta");
        if(Files.notExists(pastaPath)) {
            Path pastaDiretory = Files.createDirectory(pastaPath);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subpasta/subpasta");
        if (Files.notExists(subPastaPath)) {
            Path subpastaDiretory = Files.createDirectories(subPastaPath);
        }

        //Criar Arquivos
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        //Copiar um arquivo
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamd.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        JFrame janela = new JFrame();
    }
}
