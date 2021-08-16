package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salAnual = 70000;
        double desconto, juros;

        if (salAnual <= 34712) {
            juros = (9.70 / 100);
        } else if (salAnual >= 34713 && salAnual < 68507) {
            juros = (37.35 / 100);
        } else {
            juros = (49.50 / 100);
        }
        desconto = salAnual * juros;
        System.out.println("Salario anual descontando os juros:" + desconto);
    }
}
