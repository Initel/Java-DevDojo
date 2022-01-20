package ademy.devdojo.maratonajava.Javacore.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("pt", "BR"));

        //Ingles
        String hello = bundle.getString("good.morning");
        System.out.println(hello);
        //Portugues (BR)
        String hello1 = bundle1.getString("good.morning");
        System.out.println(hello1);

        //Ordem se nao achar aquivo correto
        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_en_US.properties
        // messages_en.properties
        // messages.properties
        System.out.println(bundle.getString("hi"));
    }
}
