package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;
import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora2 = new Calculadora();
        calculadora2.multiplicaDoisNumero(25,2);
        double result = calculadora2.divideDoisNum(5,3);
        System.out.println(result);
    }
}
