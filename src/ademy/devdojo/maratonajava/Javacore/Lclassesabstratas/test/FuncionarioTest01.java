package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.test;
import ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain.Desenvolvedor;
import ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
