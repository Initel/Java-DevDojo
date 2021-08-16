package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("-----------");
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
    }
}
