package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Escola;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Iruka");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Shiratorizawa",professores);

        escola.imprime();
    }
}
