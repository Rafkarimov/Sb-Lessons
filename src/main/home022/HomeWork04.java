package main.home022;

import java.util.Arrays;
import java.util.Scanner;

/*
4.	На вход подается число N — количество строк и столбцов матрицы. Затем передается сама матрица, состоящая из
натуральных чисел. После этого передается натуральное число P.
Необходимо найти элемент P в матрице и удалить столбец и строку его содержащий (т.е. сохранить и вывести на экран
массив меньшей размерности). Гарантируется, что искомый элемент единственный в массиве.
Ограничения:
●	0 < N < 100
●	0 < ai < 1000

Входные данные
3
1 2 3
1 7 3
1 2 3
7

4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 5
5

Выходные данные
1 3
1 3

1 2 3
1 2 3
1 2 3

 */
public class HomeWork04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == p) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int[][] arrMinus = new int[n - 1][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != x && j != y) {
                    arrMinus[i > x ? i - 1 : i][j > y ? j - 1 : j] = arr[i][j];
                }
            }
        }
        printArray(arrMinus);
    }

    /*

3
1 2 3
1 7 3
1 2 3
7

1 3
1 3
     */

    private static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + (j == i.length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
