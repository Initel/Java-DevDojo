package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 10;
        String categoria;
        if (age < 15) {
            categoria = "Categoria Infantil";
        } else if (age >= 15 && age < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
