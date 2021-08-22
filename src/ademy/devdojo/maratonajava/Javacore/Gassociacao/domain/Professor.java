package ademy.devdojo.maratonajava.Javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-------------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null){
            return;
        }else{
            System.out.println("##Seminarios Cadastrados ##");
            for (Seminario seminario: this.seminarios) {
                System.out.println(seminario.getTitulo());
                System.out.println("Endereço: " + seminario.getLocal().getEndereco());
                if (seminario.getAlunos() == null) {break;}
                else {
                    System.out.println("** Alunos **");
                    for (Aluno aluno : seminario.getAlunos()) {
                        System.out.println("Alunos : " + aluno.getNome() + " idade: " + aluno.getIdade());
                    }
                }
            }
        }
        System.out.println("--------------------------");
    }

    //Nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    //Especialidade
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
    //Seminario
    public Seminario[] getSeminarios() {return seminarios;}
    public void setSeminarios(Seminario[] seminarios) {this.seminarios = seminarios;}
}
