package ademy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args){

        for (int i = 1; i <=1000000; i+=2){
            if (i % 2 == 0) {
                System.out.println(i);
            }else{
                i++;
            }
        }

        System.out.println("-----------------------------");

    }
}
