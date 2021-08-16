package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;

    public void imprime() {
        double[] salario = this.salarios;
        double soma = 0;
        if (salarios == null) {
            return;
        }
        for (double num : salario) {
            soma += num;
        }
        System.out.println("-------------------");
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Média Salarial: " + (soma / salario.length));
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
}
