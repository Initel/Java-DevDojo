package ademy.devdojo.maratonajava.Javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores != null){
            for (Professor professors: professores) {
                System.out.println(professors.getNome());
            }
        }else{
            return;
        }
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Professor[] getProfessores() {return professores;}
    public void setProfessores(Professor[] professores) {this.professores = professores;}
}
