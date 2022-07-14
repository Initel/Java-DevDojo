package ademy.devdojo.maratonajava.Javacore.Zgenerics.test;

import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Barco;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Carro;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        //Carro
        List<Carro> carroDisp = new ArrayList<>(List.of(new Carro("Uno com escada"), new Carro("Ferrari")));
            //Alugando
            RentalService<Carro> rentalService = new RentalService<>(carroDisp);
            Carro carro = rentalService.buscarObjtoDisp();
            System.out.println("Alugando carro pos um mes....");
            rentalService.retornaObjetoAlugado(carro);

        System.out.println("//--------------------------------------------------//");
        //Barco
        List<Barco> barcoDisp = new ArrayList<>(List.of(new Barco("Bote"), new Barco("Yate")));
            //Alugando
            RentalService<Barco> rentalService1 = new RentalService<>(barcoDisp);
            Barco barco = rentalService1.buscarObjtoDisp();
            System.out.println("Alugando barco por um mes....");
            rentalService1.retornaObjetoAlugado(barco);
    }
}
