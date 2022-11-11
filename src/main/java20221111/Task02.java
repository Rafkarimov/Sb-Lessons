package main.java20221111;

import java.util.Scanner;

/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел длины N.
    Вывести элементы, стоящие на четных индексах массива.

    Вход            Выход
    5               1 3 5
    1 2 3 4 5

    4               20 11
    20 20 11 13

 */
public class Task02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
