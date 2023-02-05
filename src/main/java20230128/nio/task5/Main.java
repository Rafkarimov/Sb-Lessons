package main.java20230128.nio.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Прочитать и вывести содержимое файла с помощью NIO и newBufferedReader
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/test.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
