package main.java20230114.task8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//    На вход подается количество слов n и слова (каждое на отдельной строке).
//    Посчитать сколько раз встретилось каждое слово.
//    Вывести результат для каждого слова (в любом порядке).
//    Пример:
//6
//слон
//слон
//кот
//мышь
//кот
//кот
//
//->
//    слон 2
//    кот 3
//    мышь 1

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            String str = scanner.next();

            Integer count = map.get(str);
            if (count == null) {
                count = 1;
            } else {
                ++count;
            }
            map.put(str, count);
        }
        System.out.println(map);
    }
}

