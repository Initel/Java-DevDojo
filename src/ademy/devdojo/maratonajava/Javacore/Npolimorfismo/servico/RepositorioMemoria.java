package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico;

import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
