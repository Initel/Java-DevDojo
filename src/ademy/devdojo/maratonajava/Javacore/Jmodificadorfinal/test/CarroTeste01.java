package ademy.devdojo.maratonajava.Javacore.Jmodificadorfinal.test;
import ademy.devdojo.maratonajava.Javacore.Jmodificadorfinal.domain.Carro;
import ademy.devdojo.maratonajava.Javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
