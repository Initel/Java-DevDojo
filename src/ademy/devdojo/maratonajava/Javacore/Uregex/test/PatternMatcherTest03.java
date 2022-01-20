package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args){
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo o(s) branco(s)
        // \w = a-z A-Z, digitos, _
        // \W = O que o nao e incluso no \w
//      String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";

//        String texto1 = "abobora e abacate";
//        String texto2 = "chaHOLANDE123";
        String texto3 = "12 0x 0x 0xFFABC 0x109 0x9753";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto3);
        System.out.println("Texto : " + texto3);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex : " + regex);
        System.out.println("Posicoes encontradas");
        System.out.println("--------------------");
        while (matcher1.find()){
            System.out.print(matcher1.start() + " " + matcher1.group()+"\n");
        }
        System.out.println("--------------------");
        int numHex = 0xFF2;
        System.out.println(numHex);
    }
}
