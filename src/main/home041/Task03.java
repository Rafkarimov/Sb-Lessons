package main.home041;

import java.io.*;
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
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"));
             Writer wr = new FileWriter("output.txt")) {
            while (scanner.hasNext()) {
                wr.write(scanner.nextLine().toUpperCase() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
