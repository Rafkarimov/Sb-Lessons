package main.java20221227;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {
    public static void main(String[] args) {
        try (Writer wr = new FileWriter("output.txt")) {
            wr.write("Hello!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
