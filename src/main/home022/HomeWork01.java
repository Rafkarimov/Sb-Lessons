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
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        String str = "";
        for (int i = 0; i < m; i++) { // прошлись по 1 строке
            int[] temp = arr[i];
            Arrays.sort(temp);
            str += temp[0] + " ";
        }
        System.out.println(str);
    }
}
