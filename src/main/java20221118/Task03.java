package main.java20221118;

import java.util.Scanner;

/*
На вход подается число N - ширина и высота матрицы. Затем передается сама матрица, состоящая из натуральных чисел.
    После этого передается натуральное число P.
    Необходимо найти в матрице число P и занулить строку и столбец, в котором это число находится (кроме числа P).
    Применить эту операцию ко всем найденным числам P.

    Вход
    3
    1 2 3
    1 5 3
    1 2 3
    5

    Выход
    1 0 3
    0 5 0
    1 0 3

 */
public class Task03 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == p) {
                    fillWithZero(arr, n, i, j, p);

                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillWithZero(int[][] array, int n, int i, int j, int p) {
        //заполняем нулями  столбы в строке, содержащей p
        for (int k = 0; k < n; k++) { // индекс столбца
            if (array[i][k] != p) {
                array[i][k] = 0;
            }
        }
//Заполняем нулями строки в столбце, содержащей p
        for (int k = 0; k < n; k++) {
            if (array[k][j] != p) {
                array[k][j] = 0;
            }
        }
    }
}
