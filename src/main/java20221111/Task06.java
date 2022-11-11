package main.java20221111;
/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел из N элементов.
    Необходимо циклически сдвинуть элементы на 1 влево.

    Вход            Выход
    5               2 3 4 7 1
    1 2 3 4 7

    3               10 20 2
    2 10 20

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 1 2 3 4 5 через arraycopy на позицию другую. Последний элемент переопределяем на первый исходный
        int firstElem = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length - 1] = firstElem;
        System.out.println(Arrays.toString(arr));
    }
}
