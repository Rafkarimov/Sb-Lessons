package main.home022;

import java.util.Scanner;

/*
3.	На вход подается число N — количество строк и столбцов матрицы. Затем передаются координаты X и Y расположения
коня на шахматной доске.

Необходимо заполнить матрицу размера NxN нулями, местоположение коня отметить символом K, а позиции, которые он
может бить, символом X.

Ограничения:
●	4 < N < 100
●	0 <= X, Y < N

Входные данные
5
0 4

7
3 3


0 0 0 0 0
0 0 0 0 0
0 X 0 0 0
0 0 X 0 0
K 0 0 0 0

0 0 0 0 0 0 0
0 0 X 0 X 0 0
0 X 0 0 0 X 0
0 0 0 K 0 0 0
0 X 0 0 0 X 0
0 0 X 0 X 0 0
0 0 0 0 0 0 0


 */
public class HomeWork03 {
    private static final int[] xMoves = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] yMoves = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        String[][] arr = new String[n][n];
        addKnightMoves(arr, y, x);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = "0";
                }
            }
        }
        printArray(arr);

/**
 7
 3 3

 {2 1, 4 1, 2 5, 4 5 ||  1 2, 1 4, 5 2, 5 4}

 */
    }

    private static void addKnightMoves(String[][] arr, int y, int x) {
        int n = arr[0].length;
        arr[y][x] = "K";
        for (int i = 0; i < xMoves.length; i++) {
            int yTemp = y + yMoves[i];
            int xTemp = x + xMoves[i];

            if ((yTemp >= 0 && xTemp >= 0) && (yTemp < n && xTemp < n)) {
                arr[yTemp][xTemp] = "X";
            }
        }
    }

    private static void printArray(String[][] arr) {
        for (String[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + (j == i.length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
