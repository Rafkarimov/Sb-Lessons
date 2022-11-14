package main.home021;

import java.util.Scanner;

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

    }
}
