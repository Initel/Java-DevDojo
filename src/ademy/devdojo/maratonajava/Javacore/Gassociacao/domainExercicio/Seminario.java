package ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio;

public class Seminario {
    private String titulo;
    private Professor[] professors;

    public Seminario(String titulo, Professor[] professors) {
        this.titulo = titulo;
        this.professors = professors;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println("       Seminario       ");
        System.out.println("-----------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("-----------------------");
    }

    //Titulo
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
}
