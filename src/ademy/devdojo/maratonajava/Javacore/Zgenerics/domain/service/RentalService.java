package ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T>{
    private List<T> objetosDisp;

    public RentalService(List<T> objetosDisp) {
        this.objetosDisp = objetosDisp;
    }


    public T buscarObjtoDisp(){
        System.out.println("Buscando carro disponivel");
        T t = objetosDisp.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisp);
        return t;
    }

    public void retornaObjetoAlugado(T t){
        System.out.println("Retornando objeto: " + t);
        objetosDisp.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisp);
    }
}
