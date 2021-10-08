package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.Test;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Computador;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Produto;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Tomate;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzeen 9", 3000);
        Tomate tomate = new Tomate("America"  ,20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
