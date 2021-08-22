package ademy.devdojo.maratonajava.Javacore.Gassociacao.testExercicio;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Professor;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domainExercicio.Seminario;


public class SeminarioTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Getulho", "Física");
        Professor[] professors = {professor};
        Seminario seminario = new Seminario("Tales a demons and gods",professors);

        System.out.println(seminario.getTitulo());
        System.out.println(professor.getNomeProf());
        System.out.println(professor.getEspecialidade());
    }
}
