package main.home022;

import java.util.Arrays;
import java.util.Scanner;

/*
1.	На вход передается N — количество столбцов в двумерном массиве и M — количество строк. Затем сам передается
двумерный массив, состоящий из натуральных чисел.
Необходимо сохранить в одномерном массиве и вывести на экран минимальный элемент каждой строки.
Ограничения:
●	0 < N < 100
●	0 < M < 100
●	0 < ai < 1000

Входные данные:
3 2
10 20 15
7 5 9

1 3
30
42
15

Выходные данные
10 5

30 42 15

 */
public class HomeWork01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] result = new int[arr.length-1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE; // начальный минимум с максимальным значением int
            for (int j = 0; j < m; j++) {
                if (min > arr[i][j]) { // если элемент меньше моего
                    min = arr[i][j]; // назначьте новое минимальное значение
                }
            }
            result[i] = min; // сохраняем
        }
        System.out.println(Arrays.toString(result));
    }
}
