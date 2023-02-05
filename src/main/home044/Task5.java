package main.home044;

import java.util.List;
import java.util.stream.Collectors;

/*
Все задачи этого блока необходимо решить, используя стримы:
На вход подается список непустых строк. Необходимо привести все символы строк к
верхнему регистру и вывести их, разделяя запятой.
Например, для List.of("abc", "def", "qqq") результат будет ABC, DEF, QQQ.

 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(transformListToString(List.of("abc", "def", "qqq")));
    }

    private static String transformListToString(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }
}
