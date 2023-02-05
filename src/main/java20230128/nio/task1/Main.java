package main.java20230128.nio.task1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
создать файл в src/ с названием test.txt
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        try {
            System.out.println(Files.createFile(path)); // создаем файл
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + e.getMessage()); // если уже создан
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
