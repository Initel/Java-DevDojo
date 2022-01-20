package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1 0xF2";
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
