package ademy.devdojo.maratonajava.Javacore.Ycolecoes.test;
import ademy.devdojo.maratonajava.Javacore.Ycolecoes.domain.Smartphone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartohneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1vs903", "Iphone");
        Smartphone s2 = new Smartphone("af7456", "Asus");
        Smartphone s3 = new Smartphone("98s4fg", "Sansung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
//      smartphones.clear();


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println();

        Smartphone s4 = new Smartphone("af7456", "Asus");
        smartphones.add(s4);
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);

    }
}
