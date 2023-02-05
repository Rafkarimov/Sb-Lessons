package main.java20230128.nio.task2;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
создать папку и подпапку в src/
 */
public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("src/MyFolder");
        Path path2 = Paths.get("src/MyFolder/MyAnotherFolder");
        try {
            Files.createDirectory(path1);
            Files.createDirectory(path2);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + e.getMessage()); // если уже создан
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
