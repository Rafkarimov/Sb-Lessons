package main.stream.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppGroupBy {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.add(3); // нельзя чтоб были дубли в Map, для этого вводиться merge

        Map<Integer, List<Integer>> newMap = list.stream()
                .collect(Collectors.groupingBy((Integer digit) -> {
                    return digit % 3;
                }));


        System.out.println(list);
        System.out.println(newMap);
    }
}
