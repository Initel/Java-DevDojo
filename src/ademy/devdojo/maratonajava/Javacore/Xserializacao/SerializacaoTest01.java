package ademy.devdojo.maratonajava.Javacore.Xserializacao;

import ademy.devdojo.maratonajava.Javacore.Xserializacao.domain.Aluno;
import ademy.devdojo.maratonajava.Javacore.Xserializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(12L,"Diego Santos", "134679258");
        Turma turma = new Turma("Maratona java Virado no jiraya em breve todos ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }


    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
