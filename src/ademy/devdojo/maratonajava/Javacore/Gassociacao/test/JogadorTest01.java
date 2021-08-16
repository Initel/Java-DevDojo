package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;

import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
