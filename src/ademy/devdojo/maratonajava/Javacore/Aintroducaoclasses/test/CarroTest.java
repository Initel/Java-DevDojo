package ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.test;
import ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "gersinho1";
        carro1.modelo = "Palio";
        carro1.ano = 1997;

        carro2.nome = "rodisvaldo";
        carro2.modelo = "Gol";
        carro2.ano = 2000;

        System.out.println("------------------------");
        System.out.println("Carro 1: "+carro1.nome+"\nModelo "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("------------------------");
        System.out.println("Carro 2: "+carro2.nome+"\nModelo "+carro2.modelo+"\nAno: "+carro2.ano);
        System.out.println("------------------------");
    }

}
