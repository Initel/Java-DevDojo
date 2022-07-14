package ademy.devdojo.maratonajava.Javacore.Zgenerics.test;

import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Barco;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenerico {
    public static void main(String[] args) {
        //Sem void
        criarArrayComUmObj(new Barco("Canoinha"));
        criarArrayComUmObj(new Barco("Bote"));
        //
        System.out.println("||-------------------------------------------||");
        //
        //Com void
        List<Carro> carroList = criarArrayComUmObj1(new Carro("Mustang"));
        System.out.println(carroList);
    }

    private static <T> void criarArrayComUmObj(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
    private static <T> List<T> criarArrayComUmObj1(T t){
        List<T> list = List.of(t);
        return list;
    }
}