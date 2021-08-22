package ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio;

public class Aluno {
    private String nome;
    private int idade;
    private Professor[] professors;
    private Seminario[] seminarios;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Professor[] professors) {
        this.nome = nome;
        this.idade = idade;
        this.professors = professors;
    }

    public Aluno(String nome, int idade, Professor[] professors, Seminario[] seminarios) {
        this.nome = nome;
        this.idade = idade;
        this.professors = professors;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("       Aluno       ");
        System.out.println("-----------------------");
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("-----------------------");
    }

    //nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    //Idade
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
}
