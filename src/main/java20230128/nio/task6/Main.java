package main.java20230128.nio.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

/*
Прочитать и вывести содержимое файла с помощтю NIO и streams()
Прочитать и вывести содержимое файла с помощью NIO и readAllLines()
Можно дополнительно filter() добавить после lines и до forEach
 */
public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("src/test.txt");
        Path path2 = Paths.get("src/test1.txt");
        try (Stream<String> stream = Files.lines(path1)) {
            List<String> contents = Files.readAllLines(path1);
//            contents.forEach(System.out::println);
            stream
                    .map(String::toUpperCase)
                    .forEach(s -> {
                        try {
                            Files.writeString(path2, "\n" + s, StandardOpenOption.APPEND);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        try {
//            Files.readAllLines(path)
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}


