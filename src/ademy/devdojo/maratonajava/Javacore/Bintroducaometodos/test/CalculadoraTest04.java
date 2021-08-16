package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNums(num1, num2);
        System.out.println("Dentro do CalculadoraTeest04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
