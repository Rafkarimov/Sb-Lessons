package main.home042.anagramma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//С консоли на вход подается две строки s и t. Необходимо вывести true, если
//одна строка является валидной анаграммой другой строки и false иначе.
//Анаграмма — это слово или фраза, образованная путем перестановки букв
//другого слова или фразы, обычно с использованием всех исходных букв ровно
//один раз.
public class Main {
    public static void main(String[] args) {
        String s = "атлас";
        String t = "салат";

        List<String> list1 = Stream.of(s.split("")).collect(Collectors.toCollection(ArrayList::new));
        List<String> list2 = Stream.of(t.split("")).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println(list1.equals(list2));
    }
}
