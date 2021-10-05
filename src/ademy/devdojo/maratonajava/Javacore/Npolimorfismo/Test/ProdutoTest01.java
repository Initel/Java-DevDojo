package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.Test;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Computador;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Televisao;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Tomate;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args){
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Ingles", 10);
        Televisao tv = new Televisao("Sansung q21 50\" ", 6500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tv);

    }
}
