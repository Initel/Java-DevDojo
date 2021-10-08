package ademy.devdojo.maratonajava.Javacore.Npolimorfismo.Test;

import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.repositorio.Repositorio;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioArquivo;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import ademy.devdojo.maratonajava.Javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Luffy");
        list.add("Naruto");
        list.add("Denji");
        System.out.println(list);
    }
}
