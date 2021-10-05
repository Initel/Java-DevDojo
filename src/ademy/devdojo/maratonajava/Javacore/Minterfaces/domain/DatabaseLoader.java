package ademy.devdojo.maratonajava.Javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissôes no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro retrieveMaxDataSize na interface2");
    }
}
