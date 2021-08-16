package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("------------------\nIdade inválida\n------------------");

        }
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Nome : " + nome);
        System.out.println("Idade: " + idade);
    }
}
