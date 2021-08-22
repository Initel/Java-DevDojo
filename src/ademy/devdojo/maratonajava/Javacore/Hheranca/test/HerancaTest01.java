package ademy.devdojo.maratonajava.Javacore.Hheranca.test;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Endereco;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Funcionario;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("123456789-87");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario(); 
    }
}
