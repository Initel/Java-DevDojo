package ademy.devdojo.maratonajava.Javacore.Zgenerics.test;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Luffy");

        for (Object o : lista){
            if(o instanceof String){
                System.out.println(o);
            }
        }
    }
}
