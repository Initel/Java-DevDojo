package ademy.devdojo.maratonajava.Javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumento");
    }

    public void imprime() {
        System.out.println("\n----------------------");
        System.out.println("Nome    : " + this.nome);
        System.out.println("Tipo    : " + this.tipo);
        System.out.println("Qtde eps: " + this.episodios);
        System.out.println("Gênero  : " + this.genero);
        System.out.println("Estudio : " + this.estudio);
        System.out.println("----------------------\n");
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEspisodios(int espisodios) {
        this.episodios = espisodios;
    }

    public int getEspisodeos() {
        return episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
