package main.java20221118;

import java.util.Scanner;

/*
    На вход подается число N — ширина и высота матрицы.

    Необходимо заполнить матрицу
    1 и 0 в виде шахматной доски.
    Нулевой элемент должен быть 0.

    вход
    3

    выход
    -------j
   | 0 1 0
   | 1 0 1
  i| 0 1 0

 */
public class Task02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j) % 2 == 0) {
//                    arr[i][j] = 0;
                }else {
                    arr[i][j] = 1;
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
}
