package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{
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

    @Override
    public void calcBonus() {
        double num = this.salario;
        this.salario = (num * 2) * 0.2;
    }
}
