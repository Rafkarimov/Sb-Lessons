package main.home021;

import java.util.*;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M.
Необходимо найти в массиве число, максимально близкое к M (т.е. такое число,
для которого |ai - M| минимальное). Если их несколько, то вывести
максимальное число.

Входные данные
6
-10 9 -5 -6 1 -3
-4

2
10 20
21

Выходные данные
-3

20

 */
public class HomeWork08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int diff = 1000;
        int num = -1000;
        for (int i = 0; i < n; i++) {
            int temp = Math.abs(ai[i] - m);
            if (temp <= diff) {
                diff = temp;
                if (ai[i] > num) {
                    num = ai[i];
                }
            }
        }
        System.out.println(num);

//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        for (int v : ai) {
//            map.put(v, Math.diff(v - m));
//        }
//        System.out.println(map);
//        int diff = map.values().stream()
//                .min(Integer::compareTo).get();
//        System.out.println(diff);
//        int result = map.entrySet().stream()
//                .filter(e -> e.getValue() == diff)
//                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
//        System.out.println(result);
    }
}

