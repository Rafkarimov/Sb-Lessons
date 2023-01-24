package main.home042.dop;

import java.util.*;

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
public class MainTest {
    public static void main(String[] args) {
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the",
                "sunny", "is", "is", "day", "day"};
        int k = 4;
        String[] result = groupAndSortWord(words, k);
        System.out.println("RESULT");
        System.out.println(Arrays.toString(result));
    }

    private static String[] groupAndSortWord(String[] array, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = array.length-1; i >= 0; i--) {
            String word = array[i];
            map.merge(word, 1, Integer::sum);
        }
        System.out.println(map);
//        for (String word : array) {
//            map.merge(word, 1, Integer::sum);
//        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .limit(k)
                .toArray(String[]::new);
    }
}
