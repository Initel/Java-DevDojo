package ademy.devdojo.maratonajava.Javacore.Zgenerics.test;

import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Barco;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.Carro;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service.BarcoRentavelService;
import ademy.devdojo.maratonajava.Javacore.Zgenerics.domain.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisp();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.retornaCarroAlugado(carro);

        System.out.println("------------------------------------------------");

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisp();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelService.retornaCarroAlugado(barco);
    }
}
