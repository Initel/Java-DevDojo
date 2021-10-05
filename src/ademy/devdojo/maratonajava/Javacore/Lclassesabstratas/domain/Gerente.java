package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
    }
}
