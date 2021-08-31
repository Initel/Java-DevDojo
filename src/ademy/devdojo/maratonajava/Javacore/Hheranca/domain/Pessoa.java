package ademy.devdojo.maratonajava.Javacore.Hheranca.domain;

public class Pessoa extends Object{
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-----------------------------");
        System.out.println("Endereço:\nRua: " + endereco.getRua() + "\nCEP: " + endereco.getCep());
    }


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}
}