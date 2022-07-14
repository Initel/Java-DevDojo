package ademy.devdojo.maratonajava.Javacore.Zgenerics.domain;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
