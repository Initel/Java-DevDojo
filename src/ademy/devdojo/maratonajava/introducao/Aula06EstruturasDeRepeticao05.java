package ademy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valTotal = 30000;
        for (int parcela = (int) valTotal; parcela >=1; parcela--){
            double valParcela = valTotal / parcela;
            if (valParcela < 1000){
                continue;
            }
            System.out.println("O carro pode ser parcelado em: " + parcela + " de R$ " + valParcela);
        }
    }
}
