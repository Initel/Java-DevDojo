package ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.test;

import ademy.devdojo.maratonajava.Javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome  = "Diego";
        estudante.idade = 15;
        estudante.sexo  = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
