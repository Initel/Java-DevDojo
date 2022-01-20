package ademy.devdojo.maratonajava.Javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        //Criando diretorio
        File diretorio = new File("pasta");
        boolean isDiretorioCreated = diretorio.mkdir();
        System.out.println("A criada           : " + isDiretorioCreated);

        //Criando arquivo
        File arquivoDiretorio = new File(diretorio, "file.txt");
        boolean newFile = arquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado     : " + newFile);

        //Renomeando arquivo
        File fileRenamed = new File(diretorio,"arquivo_renomeado.txt");
        boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo Renomeado  : " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed= diretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio Renomeado : ");
    }
}
