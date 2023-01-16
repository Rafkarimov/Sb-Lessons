package main.homedop;

import java.util.HashMap;
import java.util.Map;

public class TestMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Robert C. Martin", "Clean Code");
        map.put("Joshua Bloch", "Effective Java");
        for (String key : map.keySet()) {
            System.out.println("key: " + key + " value: " + map.values());
        }
    }
}
