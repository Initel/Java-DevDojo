package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.Test;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Computador;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Produto;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzeen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------");
        Produto produto2 = new Tomate("Tomate italiano", 13);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}