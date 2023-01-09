package main.home041;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/*
Реализовать метод, открывающий файл ./input.txt и сохраняющий в файл
./output.txt текст из input, где каждый латинский строчный символ заменен на
соответствующий заглавный. Обязательно использование try с ресурсами.
 */
public class Task03 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input.txt");
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach((String word) -> {
                if (word.length() > 1) {
                    word.substring(0, 1).toUpperCase();
                }
            }
        }
//                Scanner scanner = new Scanner(new File("input.txt"));
        Writer wr = new java.io.FileWriter("output.txt");
        )

    } catch(
    IOException e)

    {
        e.printStackTrace();
    }
}
