package ademy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double rest = num1 / (double) num2;
        System.out.println("Valor: " + rest);
        System.out.println("");

        // %
        int resto = 20 % 3;
        System.out.println(resto);
        System.out.println("");
        // < > <= >= == !==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte : " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte : " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte    : " + isDezIgualVinte);
        System.out.println("isDezIgualDez      : " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);
        System.out.println("isDezDiferenteDez  : " + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isMaiorQueTrintaDentroDaLei = idade >= 30 && salario > 4612;
        boolean isMenorQueTrintaDentroDaLei = idade < 30 && salario < 3381;
        System.out.println("");
        System.out.println("isMaiorQueTrintaDentroDaLei: " + isMaiorQueTrintaDentroDaLei);
        System.out.println("isMenorQueTrintaDentroDaLei: " + isMenorQueTrintaDentroDaLei);
        System.out.println("");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPS5 = 5000;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupança > valorPS5;
        System.out.println("isPS5Compravel: " + isPS5Compravel);
        System.out.println("");

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 1700;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 2;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
