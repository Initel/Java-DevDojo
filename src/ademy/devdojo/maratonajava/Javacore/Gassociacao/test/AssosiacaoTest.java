package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Aluno;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Local;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Professor;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Seminario;

public class AssosiacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy",17);
        Aluno aluno1 = new Aluno("Sanji", 19);
        Professor professor = new Professor("Rayleng","Pirata");
        Aluno[] alunos = {aluno, aluno1};
        Seminario seminario = new Seminario("Onde está o One Piece",alunos,local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
