package ademy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        float valCarro = 30001;
        int valParcelaMax = 1000;

        for (int parcela = 1; parcela <= valCarro; parcela++) {
            float valParcela = valCarro / parcela;
            if (valParcela >= valParcelaMax) {
                System.out.println("O carro pode ser parcelado em: " + parcela + " de R$ " + valParcela);
            }else{
                break;
            }
        }

    }
}
