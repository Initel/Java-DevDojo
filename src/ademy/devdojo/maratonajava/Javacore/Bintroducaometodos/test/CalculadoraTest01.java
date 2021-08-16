package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNums(50,50);
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNum(190,90);
    }
}
