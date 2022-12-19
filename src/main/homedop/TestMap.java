package main.homedop;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("milk", 2);
        map.put("bread", 3);
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
        map.entrySet().forEach(System.out::println);
        map.forEach((key, value) -> System.out.println(key + " " + value));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String str : map.keySet()) {
            System.out.println(str);
        }

        for (Integer integer : map.values()) {
            System.out.println(integer);
        }
    }
}
