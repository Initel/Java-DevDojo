package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcBonus() {
        double num = this.salario;
        this.salario = num + num * 0.5;
    }
}
