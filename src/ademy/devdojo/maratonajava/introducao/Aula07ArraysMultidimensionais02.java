package ademy.devdojo.maratonajava.introducao;


public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0},{1, 2, 3},{1, 2, 3, 4, 5, 6}};

        for (int[] base : arrayInt) {
            System.out.println("\n-------");
            for (int num : base) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n----------------");
        for (int[] base : arrayInt2) {
            System.out.println("\n-------");
            for (int num : base) {
                System.out.print(num + " ");
            }
        }
    }
}
