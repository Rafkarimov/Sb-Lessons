package main.home021;

import java.util.Arrays;
import java.util.Scanner;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого аналогично передается второй
массив (aj) длины M.
Необходимо вывести на экран true, если два массива одинаковы (то есть
содержат одинаковое количество элементов и для каждого i == j элемент ai ==
aj). Иначе вывести false.

Входные данные
7
1 2 3 4 5 6 7
7
1 2 3 4 5 6 7

3
89 12 46
3
12 89 46

1
15
4
2 4 6 8
Выходные данные
true

false

false
 */
public class HomeWork02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] aj = new int[m];
        for (int i = 0; i < m; i++) {
            aj[i] = sc.nextInt();
        }
//        boolean flag = Arrays.equals(ai, aj);
//        System.out.println(flag);
        System.out.println(compareArrays(ai, aj)); // никаких булиен, если в соуте
    }

    private static boolean compareArrays(int ai[], int aj[]) {
        if (ai.length != aj.length) {
            return false;
        }
        for (int i = 0; i < ai.length; i++) {
            if (ai[i] != aj[i]) {
                return false;
            }
        }
        return true;
    }
}
