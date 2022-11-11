package main.java20221111;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается число N — длина массива. Затем передается массив целых чисел из N элементов.

Необходимо переставить элементы в полученном массиве в обратном порядке и вывести их на экран. Важно: нельзя
использовать дополнительный массив.


Входные данные	Выходные данные
8
10 2 38 75 9 38 123 2	2 123 38 9 75 38 2 10


 */
public class Task11 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //10 2 38 75 9 38 123 2
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i]; // 10 | 2
            arr[i] = arr[n - i - 1]; // arr[0] =2 | arr[1] = 123
            arr[n - i - 1] = temp; // arr[n-1] = temp | arr[n-2] = temp
        }
        System.out.println(Arrays.toString(arr));
    }
}
