package main.home022;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается число N — количество строк и столбцов матрицы. Затем в последующих двух строках подаются
координаты X (номер столбца) и Y (номер строки) точек, которые задают прямоугольник.

Необходимо отобразить прямоугольник с помощью символа 1 в матрице, заполненной нулями (см. пример) и вывести всю
матрицу на экран.

Входные данные:
7
1 2
3 4

5
1 0
4 1

Выходные данные

0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 1 1 1 0 0 0
0 1 0 1 0 0 0
0 1 1 1 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0


0 1 1 1 1
0 1 1 1 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

 */
public class HomeWork02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
                arr[x][y] = 1;

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

