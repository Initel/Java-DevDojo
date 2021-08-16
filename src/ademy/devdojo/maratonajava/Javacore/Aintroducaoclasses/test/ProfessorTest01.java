package ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.test;

import ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome  = "Mestre kami";
        professor.idade = 140;
        professor.sexo  = 'M';

        System.out.println("Nome: " + professor.nome + "\nidade: " + professor.idade + "\nsexo: " + professor.sexo);
    }
}
