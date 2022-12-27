package main.java20221227;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//задача 3
public class FileRead {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))){
            ArrayList<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
