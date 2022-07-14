//package ademy.devdojo.maratonajava.Javacore.Zgenerics;
//
//abstract class Animal {
//    public abstract void consulta();
//}
//
//class Cachorro extends Animal{
//    @Override
//    public void consulta() {
//        System.out.println("Consultando doguinho");
//    }
//}
//public class Gato extends Animal{
//    @Override
//    public void consulta() {
//        System.out.println("Consultando miau");
//    }
//}
//public class WildCardTest01 {
//    public static void main(String[] args) {
//        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
//        Gato[] gatos = {new Gato(), new Gato()};
//
//        printConsul(cachorros);
//        printConsul(gatos);
//
//        Animal[] animals = {new Gato(), new Cachorro()};
//        printConsul(animals);
//    }
//    private static void printConsul(Animal[] animals){
//        for (Animal animal : animals){
//            animal.consulta();
//        }
////        animals[1] = new Gato();
//    }
//}
