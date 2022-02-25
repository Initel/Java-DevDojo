package ademy.devdojo.maratonajava.Javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(10);
        nomes.add("Diego");
        nomes.add("DevDojo");
        nomes.remove(1);

        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Paulo");

        System.out.println("-----------------");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

        System.out.println();
    }
}
