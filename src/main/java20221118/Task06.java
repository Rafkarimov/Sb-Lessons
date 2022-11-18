package main.java20221118;

import java.util.Scanner;

/*
Треугольник Паскаля.
    На вход подается натуральное N.
    Необходимо вывести матрицу, заполненную по следующему правилу:
    a[i][0] = 1
    a[0][j] = 1
    a[i][j] = a[i - 1][j] + a[i][j - 1]

    Вход
    3

    Выход
    1 1 1
    1 2 3
    1 3 6

    Вход
    5

    Выход
    1 1 1 1 1
    1 2 3 4 5
    1 3 6 10 15
    1 4 10 20 35
    1 5 15 35 70

 */
public class Task06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        //Заполняем первую строку
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }
        //Заполним левый столбец
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }
        //Заполняем остальные элементы
        //a[i][j] = a[i - 1][j] + a[i][j - 1]
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
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
