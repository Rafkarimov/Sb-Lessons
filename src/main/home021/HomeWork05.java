package main.home021;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M — величина
сдвига.
Необходимо циклически сдвинуть элементы массива на M элементов вправо.

Входные данные
5
38 44 0 -11 2
2

2
12 15
0

Выходные данные
-11 2 38 44 0

12 15
 */
public class HomeWork05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] ai = new Integer[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Collections.rotate(Arrays.asList(ai), m);
        String result = "";
        for (int i : ai) {
            result += i + " ";
        }
//        String result = Arrays.stream(ai)
//                .map(Object::toString)
//                .collect(Collectors.joining(" ")).trim();
        System.out.println(result.trim());
    }
}
