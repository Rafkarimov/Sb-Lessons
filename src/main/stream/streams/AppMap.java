package main.stream.streams;

import java.util.stream.Stream;

public class AppMap {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        // map принимает Function принимает один элемент возвращает другой элемент, один стрим преобразуется в другой стрим
        Stream<String> newStream = stream.map((Integer digit) -> {
            return "str" + digit;
        });

        newStream.forEach(System.out::println);
    }
}
