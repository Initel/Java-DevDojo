package ademy.devdojo.maratonajava.Javacore.Ycolecoes.test;

import ademy.devdojo.maratonajava.Javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("!ABC231", "Blackview");
        Smartphone s2 = new Smartphone("!ABC231", "Blackview");

        System.out.println("São iguais :" + s1.equals(s2));

    }
}
