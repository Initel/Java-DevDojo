package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;
import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Diego Santos");
        funcionario1.setIdade(16);
        funcionario1.setSalarios(new double[]{2600,3200,2200});

        funcionario1.imprime();
    }
}
