package ademy.devdojo.maratonajava.Javacore.Lclassesabstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calcBonus();
}
