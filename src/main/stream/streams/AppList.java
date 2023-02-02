package main.stream.streams;

import java.util.ArrayList;
import java.util.List;

public class AppList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.stream()
                .filter(digit -> digit >= 2 && digit <= 4)
                .map(digit -> digit * 2) // принимает digit а возврает digit умноженный на 2
                .forEach(System.out::println);

        System.out.println(list); // стрим не меняет коллекцию на которую он вызван, он создает копию
    }
}
