package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args){
        String regex = "aba";
        String texto1 = "abobora e abacate";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(texto2);
        System.out.println("Texto : " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex : " + regex);
        System.out.println("Posicoes encontradas");
        System.out.println("--------------------");
        while (matcher1.find()){
            System.out.print(matcher1.start() + " ");
        }

    }
}
