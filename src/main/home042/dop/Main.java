package main.home042.dop;

import java.util.*;
import java.util.stream.Collectors;

/*
Реализовать метод, который принимает массив words и целое положительное число k.
Необходимо вернуть k наиболее часто встречающихся слов..
Результирующий массив должен быть отсортирован по убыванию частоты
встречаемого слова. В случае одинакового количества частоты для слов, то
отсортировать и выводить их по убыванию в лексикографическом порядке.

Входные данные:
words =
["the","day","is","sunny","the","the","the",
"sunny","is","is","day"]
k = 4

Выходные данные:
["the","is","sunny","day"]
 */
public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the",
                "sunny", "is", "is", "day"};
        int k = 4;
        String[] result = groupAndSortWord1(words, k);
        System.out.println("RESULT");
        System.out.println(Arrays.toString(result));
        System.out.println();
        String[] result1 = groupAndSortWord1(words, k);
        System.out.println("RESULT1");
        System.out.println(Arrays.toString(result1));
    }

    private static String[] groupAndSortWord(String[] array, int k) {
        Map<String, Integer> map1 = new HashMap<>();
        for (String word : array) {
            map1.merge(word, 1, Integer::sum);
        }

        System.out.println(map1);

        Map<Integer, Set<String>> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            Set<String> tmp = map2.get(value);
            if (tmp == null) {
                tmp = Set.of(key);
            } else {
                tmp.add(key);
            }
            map2.put(entry.getValue(), (new TreeSet<>(tmp)).descendingSet());
        }

        map2 = map2.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));

        System.out.println(map2);

        Set<String> resultSet = new LinkedHashSet<>();

        for (Map.Entry<Integer, Set<String>> entry : map2.entrySet()) {
            for (String str : entry.getValue()) {
                if (resultSet.size() < k) {
                    resultSet.add(str);
                } else {
                    break;
                }
            }
        }
        return resultSet.toArray(String[]::new);
    }

    private static String[] groupAndSortWord1(String[] array, long k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : array) {
            map.merge(word, 1, Integer::sum);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()).reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}


//        BiFunction<String, Integer, Integer> function = (String key, Integer oldValue) -> {
//            return oldValue + 5;
//        };
/*
// 1 способ
        map.compute("test", (k, v) -> v != null ? v + 1 : 1);
        // 2 способ
        map.merge("test", 1, Integer::sum);

        // 3 способ
        if (map.containsKey("test")) {
            map.put("test", map.get("test") + 1);
        } else {
            map.put("test", 1);
        }
 */
