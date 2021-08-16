package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;
import java.util.Scanner;

public class LeituraDoTest01 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.println("Digite M ou F para seu sexo");
            char sexo = input.next().charAt(0);
            System.out.println("----------------------------");
            System.out.println("Nome : " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("sexo : " + sexo);
            System.out.println("----------------------------");
        }
    }
}
