package ademy.devdojo.maratonajava.Javacore.Gassociacao.test;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Jogador;
import ademy.devdojo.maratonajava.Javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadors = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadors);

        System.out.println("------jogador1------");
        jogador1.imprime();
        System.out.println("--------Time1-------");
        time.imprime();

    }
}
