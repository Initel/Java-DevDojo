package ademy.devdojo.maratonajava.Javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(getNome());
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
