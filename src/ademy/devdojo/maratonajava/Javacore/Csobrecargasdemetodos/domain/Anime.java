package ademy.devdojo.maratonajava.Javacore.Csobrecargasdemetodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    public Anime(){

    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println("Nome   : " + this.nome);
        System.out.println("Tipo   : " + this.tipo);
        System.out.println("Qtde ep: " + this.episodios);
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
