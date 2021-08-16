package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;
import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora5 = new Calculadora();
        int[] numeros = {12,2,65,12,78,35};
        calculadora5.somaArray(numeros);
        calculadora5.somaVarArgs(1,2,3,4,5);
    }
}
