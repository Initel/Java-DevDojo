package ademy.devdojo.maratonajava.Javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissôes");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro retrieveMaxDataSize na interface");
    }

}
