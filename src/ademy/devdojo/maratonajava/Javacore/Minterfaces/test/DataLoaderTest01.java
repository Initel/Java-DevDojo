package ademy.devdojo.maratonajava.Javacore.Minterfaces.test;
import ademy.devdojo.maratonajava.Javacore.Minterfaces.domain.DataLoader;
import ademy.devdojo.maratonajava.Javacore.Minterfaces.domain.DatabaseLoader;
import ademy.devdojo.maratonajava.Javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args){
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        System.out.println("--------------------------------------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("--------------------------------------------------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("--------------------------------------------------");
        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();
    }
}
