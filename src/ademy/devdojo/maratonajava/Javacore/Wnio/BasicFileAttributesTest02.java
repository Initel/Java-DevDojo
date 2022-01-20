package ademy.devdojo.maratonajava.Javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifieldTime = basicFileAttributes.lastAccessTime();
        FileTime lasAcessTime = basicFileAttributes.lastModifiedTime();

        System.out.println("creationTime      : " + creationTime);
        System.out.println("lastModifieldTime : " + lastModifieldTime);
        System.out.println("lasAcessTime      : " + lasAcessTime);
        System.out.println();

        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModifieldTime, newCreationTime, creationTime);

        creationTime      = basicFileAttributeView.readAttributes().creationTime();
        lastModifieldTime = basicFileAttributeView.readAttributes().lastAccessTime();
        lasAcessTime      = basicFileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("creationTime      : " + creationTime);
        System.out.println("lastModifieldTime : " + lastModifieldTime);
        System.out.println("lasAcessTime      : " + lasAcessTime);
    }
}
