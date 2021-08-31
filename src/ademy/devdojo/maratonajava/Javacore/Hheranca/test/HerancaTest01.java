package ademy.devdojo.maratonajava.Javacore.Hheranca.test;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Endereco;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Funcionario;
import ademy.devdojo.maratonajava.Javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 3","012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu","123456789-87");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Echirio oda");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
