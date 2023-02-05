package main.java20230128.nio.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
переместить файл в папку
Также с помощью метода move можно переименовывать файлы
 */
public class Main {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/test1.txt");
        Path path1 = Paths.get("src/myFolder/test1.txt");
        try {
            Files.move(sourcePath, path1, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
