package ademy.devdojo.maratonajava.Javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi, SNK, Eren, Mikasa, true, 1950";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(", ");
        while(scanner.hasNext()){
//            System.out.println(scanner.next());

            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int  : " + i);
            }else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boll : " + b);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
