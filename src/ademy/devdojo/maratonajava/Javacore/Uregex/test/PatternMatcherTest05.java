package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args){
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo o(s) branco(s)
        // \w = a-z A-Z, digitos, _
        // \W = O que o nao e incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m } de n ate m
        // () agrupamento
        // | o(v|c)o ovo | oco
        // ^ inicio da linha
        // $ fim da linha

        // . 1.3 = 123,133, 1@3, 1A3

        String regex = "([a-zA-Z1-9\\._-])+@([a-zA-Z])+(\\.[a-zA-Z]+)+";
        String texto = "luffy@hotmail.com.br, 123jotaro@gmail.com, #!@zoro@mail.com.br, teste123@gmail.com, sakura@mail";
        System.out.println("--------------------");
        System.out.println("Email valido:");
        System.out.println("#!@zoro@mail.com.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        System.out.println("--------------------");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto);
        System.out.println("Texto : " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex : " + regex);
        System.out.println("Posicoes encontradas");
        System.out.println("--------------------");
        while (matcher1.find()){
            System.out.print(matcher1.start() + " " + matcher1.group()+"\n");
        }
//        System.out.println("--------------------");
//        int numHex = 0xFF2;
//        System.out.println(numHex);
    }
}
