package ademy.devdojo.maratonajava.Javacore.Gassociacao.testExercicio;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Aluno;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Professor;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Seminario;

public class AlunoTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Getulho", "Física");
        Professor[] professors = {professor};
        Seminario seminario = new Seminario("Tales a demons and gods",professors);
        Seminario[] seminarios = {seminario};
        Aluno aluno = new Aluno("Pedrinho",16,professors,seminarios);

        professor.imprime();
        System.out.println();
        seminario.imprime();
        System.out.println();
        aluno.imprime();

    }
}
