package ademy.devdojo.maratonajava.Javacore.Gassociacao.testExercicio;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Getulho", "Física");
        System.out.println("-----------------------");
        System.out.println("       Professor       ");
        System.out.println("-----------------------");
        System.out.println("Nome         :  "+professor1.getNomeProf());
        System.out.println("Especialidade: "+professor1.getEspecialidade());


    }
}
