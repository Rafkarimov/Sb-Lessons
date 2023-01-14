package main.java20230114.task7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hm1 = new HashMap<>();

        hm1.put("1", "one");
        hm1.put("2", "two");
        hm1.put("3", "three");

        System.out.println(hm1);

        for (Map.Entry<String, String> entry : hm1.entrySet()) {
            entry.setValue("qwe");
        }

        System.out.println(hm1);

        System.out.println("Элементы мапы: " + hm1);

        System.out.println("Значение элемента 2 " + hm1.get("2"));
    }
}


