package main.home021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Входные данные
6
7 7 7 10 26 26

2
-5 7

Выходные данные
3 7
1 10
2 26

1 -5
1 7
 */
public class HomeWork041 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        map.entrySet().forEach(e -> System.out.println(e.getValue() + " " + e.getKey()));
    }
}
