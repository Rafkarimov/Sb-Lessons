package main.java20221111;
/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел длины N.
    Вывести все четные элементы массива.
    Если таких элементов нет, вывести -1.

    Вход            Выход
    5               2 4
    1 2 3 4 5

    4               20 20
    20 20 11 13

    1               -1
    43

 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        //Создание и заполнение массива
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}
