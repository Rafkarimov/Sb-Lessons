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
1  (y) 2 (x)
3 4

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
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i >= y1 && j >= x1) && (i <= y2 && j <= x2)) && !((i > y1 && j > x1) && (i < y2 && j < x2))) {
                    arr[i][j] = 1;
                }
//                if ((i > y1 && j > x1) && (i < y2 && j < x2)) {
//                    arr[i][j] = 0;
//                }
            }
        }
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + (j == i.length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}

