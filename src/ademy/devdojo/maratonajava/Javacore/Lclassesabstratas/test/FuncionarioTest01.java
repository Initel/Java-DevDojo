package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.test;
import ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain.Desenvolvedor;
import ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Usopp", 12000);
        Gerente gerente = new Gerente("Nami", 3500);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
