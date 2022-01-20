package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args){
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo o(s) branco(s)
        // \w = a-z A-Z, digitos, _
        // \W = O que o nao e incluso no \w
        String regex = "\\w";
//        String texto1 = "abobora e abacate";

        String texto2 = "2_@ 1af98_osif eo ij%    14e9$0w d*fo";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto2);
        System.out.println("Texto : " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex : " + regex);
        System.out.println("Posicoes encontradas");
        System.out.println("--------------------");
        while (matcher1.find()){
            System.out.print(matcher1.start() + " " + matcher1.group()+"\n");
        }

    }
}
