package main.java20221111;

import java.util.Scanner;

/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел длины N.
    Проверить, является ли он отсортированным массивом по убыванию.
    Если да, вывести true, иначе вывести false.

    Вход            Выход
    5               true
    5 4 3 2 1

    4               false
    20 20 11 13

    1               true
    43

 */
public class Task03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
