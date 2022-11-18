package main.java20221118;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход передается
    N — высота двумерного массива и
    M — его ширина.
    Затем передается сам массив.

    Необходимо сохранить в одномерном массиве
    суммы чисел каждого столбца и вывести их на экран.

    Вход
    2 2
    10 20
    5 7

    Выход
    15 27

    Вход
    3 1
    30
    42
    15

    Выход
    87


 */
public class Task01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //1 2 3 4
        //3 4 5 6
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i] += arr[j][i];

            }
        }
        System.out.println(Arrays.toString(result));
    }
}
