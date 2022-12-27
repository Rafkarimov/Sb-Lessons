package main.java20221227;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"));
             Writer wr = new java.io.FileWriter("output.txt");
        ) {
            while (scanner.hasNextLine()) {
                wr.write(scanner.nextLine() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
