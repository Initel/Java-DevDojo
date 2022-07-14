package ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service;

import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Barco;
import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> carroDisp = new ArrayList<>(
            List.of(new Barco("Bote"),
                    new Barco("Yate"))
    );

    public Barco buscarBarcoDisp(){
        System.out.println("Buscando Barco disponivel");
        Barco Barco = carroDisp.remove(0);
        System.out.println("Alugando Barco: " + Barco);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisp);
        return Barco;
    }

    public void retornaCarroAlugado(Barco barco){
        System.out.println("Retornando Barco: " + barco);
        carroDisp.add(barco);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisp);
    }

}
