package ademy.devdojo.maratonajava.Javacore.Oexeption.runtime.test;

import java.io.IOException;

public class RuntimeExceotionTest02 {
    public static void main(String[] args) {
        divisao(12, 2);

        System.out.println("Código finalizado");
    }
        /**
         *
         * @param a
         * @param b não pode ser 0
         * @return
         * @throw IllegalArgumentException caso b seja zero
         */

    public static int divisao (int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}