package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora3 = new Calculadora();
        double result = calculadora3.divideDoisNum(20,0);
        System.out.println(result);
        calculadora3.imprimeDivisaDeDoisNum(12,3);
    }
}
