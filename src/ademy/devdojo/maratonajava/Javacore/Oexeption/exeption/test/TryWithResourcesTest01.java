package ademy.devdojo.maratonajava.Javacore.Oexeption.exeption.test;

import ademy.devdojo.maratonajava.Javacore.Oexeption.exeption.domain.Leitor1;
import ademy.devdojo.maratonajava.Javacore.Oexeption.exeption.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerAquivo();
    }

    public static void lerAquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
        }
    }
}
