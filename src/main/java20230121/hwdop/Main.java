package main.java20230121.hwdop;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("the", "day", "is", "sunny",
                "sunny", "is", "is", "day");
        int k = 4;
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 1;
            } else {
                ++count;
            }
            map.put(word, count);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        System.out.println(entryList);
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("after: " + entryList);
        List<String> result = entryList.subList(0, k)
                .stream()
                .map(Map.Entry::getKey).toList();

        System.out.println("top list: " + result);
        //другой вариант
//        Comparator<Map.Entry<String, Integer>> comparator = (Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> {
//            if (Objects.equals(e1.getValue(), e2.getValue())) {
//                return (e2.getKey().compareTo(e1.getKey()));
//            }
//            return e2.getValue().compareTo(e1.getValue());
//        };
//        Set<Map.Entry<String, Integer>> result = new TreeSet<>(comparator);
//        result.addAll(map.entrySet());
//        System.out.println(result);
    }
}
