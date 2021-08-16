package ademy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        /*int count = 50;
        int count1= count+25;
        while (count <= count1){
            System.out.println(count);
            count++;
        }
        System.out.println("-----------------------------");
        for (int i = count; i <= count1; i++){
            System.out.println(i);
        }*/

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            System.out.println(i);
            if (i <= 25) {
                break;
            }
        }
    }
}
