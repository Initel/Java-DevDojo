package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}
