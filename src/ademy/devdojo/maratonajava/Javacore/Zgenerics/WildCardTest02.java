//package ademy.devdojo.maratonajava.Javacore.Zgenerics;
//
//import java.util.List;
//
//public class WildCardTest02 {
//    public static void main(String[] args) {
//        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
//        List<Gato> gatinhos = List.of(new Gato(), new Gato());
//
//        printConsul(cachorros);
//        printConsul(gatinhos);
//
//        List<Animal> animals = List.of(new Cachorro(), new Gato());
//        printConsul(animals);
//    }
//    // Type erasure ?
//    // Basicamente uma "carta" Coringa onde pode representar qualquer classe herdada
//    private static void printConsul(List<? extends Animal> animals){
//        for (Animal animal : animals){
//            animal.consulta();
//        }
//    }
//
//    // Usar o coringa e o super permite add algo a lista ja que controla desde a classe pai
//    private static void printConsulAnimal(List<? super Animal> animals){
//        animals.add(new Cachorro());
//        animals.add(new Gato());
//    }
//}
