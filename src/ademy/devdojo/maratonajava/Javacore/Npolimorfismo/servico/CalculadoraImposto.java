package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Computador;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Produto;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("--------------------------------------------");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Valor a ser pago: " + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
            /*----*/
            //System.out.println(((Tomate) produto).getDataValidade());
            /*----*/
            //String dataValidaded = ((Tomate) produto).getDataValidade();
        }
        System.out.println("--------------------------------------------");
    }
}