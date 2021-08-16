package ademy.devdojo.maratonajava.Javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somaDoisNums(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void subtraiDoisNum(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public void multiplicaDoisNumero(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divideDoisNum(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return n1 / n2;
    }

    public void imprimeDivisaDeDoisNum(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero");
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNums(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Resultado da soma: " + soma);
    }
}
