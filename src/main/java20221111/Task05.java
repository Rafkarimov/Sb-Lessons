package main.java20221111;
/*
На вход подается число N — длина массива.
    Затем передается отсортированный по возрастанию массив целых различных чисел из N элементов.
    После этого число M.
    Найти в массиве все пары чисел, которые в сумме дают число M и вывести их на экран.
    Если таких нет, то вывести -1.

    Вход            Выход
    5               1 4
    1 2 3 4 7       2 3
    5

    3               -1
    2 10 20
    14

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int m = sc.nextInt();

        //1 2 3 4 7 от 0 до n-1
        //1 2 3 4 7 от i + 1 до n
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == m) {
                    System.out.println(arr[i] + " " + arr[j]);
                    flag = true;
                }
            }

        }
        if (!flag) {
            System.out.println(-1);
        }
    }

}

