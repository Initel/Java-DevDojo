package ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service;

import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Carro;
import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carroDisp = new ArrayList<>(
            List.of(new Carro("Uno com escada"),
                    new Carro("Ferrari"))
    );

    public Carro buscarCarroDisp(){
        System.out.println("Buscando carro disponivel");
        Carro carro = carroDisp.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisp);
        return carro;
    }

    public void retornaCarroAlugado(Carro carro){
        System.out.println("Retornando carro: " + carro);
        carroDisp.add(carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carroDisp);
    }

}
