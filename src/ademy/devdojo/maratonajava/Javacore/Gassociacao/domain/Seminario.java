package ademy.devdojo.maratonajava.Javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    //Titulo
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    //Alunos
    public Aluno[] getAlunos() {return alunos;}
    public void setAlunos(Aluno[] alunos) {this.alunos = alunos;}
    //Local
    public Local getLocal() {return local;}
    public void setLocal(Local local) {this.local = local;}
}
