package ademy.devdojo.maratonajava.Javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
        System.out.println("Velocidade Limite: " + this.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
         Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
