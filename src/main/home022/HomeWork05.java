package main.home022;

import java.util.Scanner;

/*
5.	На вход подается число N — количество строк и столбцов матрицы.
Затем передается сама матрица, состоящая из натуральных чисел.

Необходимо вывести true, если она является симметричной относительно побочной диагонали, false иначе.

Побочной диагональю называется диагональ, проходящая из верхнего правого угла в левый нижний.

Ограничения:
●	0 < N < 100
●	0 < ai < 1000

Входные данные
3
1 2 3
4 5 6
7 8 9

5
57 190 160 71 42
141 79 187 19 71
141 16 7 187 160
100 42 16 79 190
15 100 141 141 57

Выходные данные
false

true
 */
public class HomeWork05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (!flag)
                break;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[n - 1 - j][n - 1 - i]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}


