package ademy.devdojo.maratonajava.Javacore.Gassociacao.domain;

public class Aluno {
    private String nome;
    private  int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    //Idade
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
}
