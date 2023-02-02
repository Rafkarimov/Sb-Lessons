package main.stream.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppToMap {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(3); // нельзя чтоб были дубли в Map, для этого вводиться merge

        Map<Integer, Integer> newMap = list.stream()
                .filter(digit -> digit >= 2 && digit <= 4)
                .map(digit -> digit * 2) // принимает digit а возврает digit умноженный на 2
                .collect(Collectors.toMap(k -> k, a -> a, (oldValue, newValue) -> {
                    System.out.println("oldValue=" + oldValue);
                    System.out.println("newValue=" + newValue);
                    return oldValue + newValue;
                }));

        System.out.println(list); // стрим не меняет коллекцию на которую он вызван, он создает копию
        System.out.println(newMap);
    }
}
