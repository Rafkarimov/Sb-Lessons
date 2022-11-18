package main.java20221118;

import java.util.Scanner;

/*
На вход подается число N — количество строк в матрице
    M - количество столбцов
    Необходимо транспонировать матрицу

    Вход
    4 2

    1 2
    3 4
    5 6
    7 8

    Выход
    1 3 5 7
    2 4 6 8

    Вход
    2 2

    2 3
    4 5

    Выход
    2 4
    3 5

 */
public class Task08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //Создание транспонированной матрицы
        int[][] arrT = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrT[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
