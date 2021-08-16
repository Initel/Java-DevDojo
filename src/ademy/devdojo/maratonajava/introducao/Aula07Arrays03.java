package ademy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numero = new int[2];
        int[] num = {1, 2, 3, 4, 5};
        int[] num2 = new int[]{1, 2, 3, 4, 5};

        /*for (int i = 0; i < num2.length ; i++) {
            System.out.println(num2[i]);
        }*/
        for (int i : num2) {
            System.out.println(i);
        }
    }
}
