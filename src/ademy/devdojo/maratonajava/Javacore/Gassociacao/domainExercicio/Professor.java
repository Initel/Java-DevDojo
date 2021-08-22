package ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio;

public class Professor {
    private String nomeProf;
    private String especialidade;

    public Professor(String nomeProf, String especialidade) {
        this.nomeProf = nomeProf;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println("       Professor       ");
        System.out.println("-----------------------");
        System.out.println("Nome         : " + this.nomeProf);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-----------------------");
    }

    //Nome
    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        nomeProf = nomeProf;
    }

    //Especialidade
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
