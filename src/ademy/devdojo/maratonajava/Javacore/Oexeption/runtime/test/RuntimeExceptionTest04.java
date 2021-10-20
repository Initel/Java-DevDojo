package ademy.devdojo.maratonajava.Javacore.Oexeption.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("4567");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }
}
