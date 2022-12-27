package main.homedop.dop;

import java.security.SecureRandom;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainMap1 {
    public static void main(String[] args) {
        Random rm = new SecureRandom();
        List<String> list = new ArrayList<>();
        list.add("даба");
        list.add("даба");
        list.add("ворожба");
        list.add("разведслужба");
        list.add("дамба");
        list.add("даба");
        list.add("авиабомба");
        list.add("даба");

//        Map<Integer, Integer> map = new TreeMap<>();
//        Set<String> set = new TreeSet<>(list);
//        System.out.println(set);

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        Function.identity(), // 1. actual String as KEY
                        value -> {
                            int count = Collections.frequency(list, value);// считает сколько раз в листе повторяется слово
                            return count > 0 ? count : 1;
                        },  // 2. String length as their VALUE
                        (key1, key2) -> key1, // 3. duplicate KEY resolver
                        TreeMap::new // 4. implementation-class
                ));
        System.out.println(map.getClass());


//        for (int i = 0; i < 100_000; i++) {
//            int x = rm.nextInt(0, 1_000);
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        System.out.println(map.size());
//        System.out.println("----------------");
//        map.entrySet().stream()
////                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .limit(10L)
//                .forEach(System.out::println);
    }
}
