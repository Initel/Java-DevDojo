package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;
import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("------------------");
        pessoa.imprime();
    }
}
