package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;

import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Jogador;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        System.out.println("---------------");
        jogador1.imprime();
    }
}
