package main.java20230128.nio.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
копировать файл с контентом
 */
public class Main {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/test.txt");
        Path destinationPath = Paths.get("src/test1.txt");
        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
