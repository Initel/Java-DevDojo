package ademy.devdojo.maratonajava.Javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fileR = new FileReader(file)){
//            char[] in = new char[1];
//            fileR.read(in);
//            for (char c: in) {
//                System.out.println(c);
//            }
            int i;
            while((i = fileR.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
