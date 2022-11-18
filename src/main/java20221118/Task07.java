package main.java20221118;

import java.util.Random;
import java.util.Scanner;

/*
 На вход передается M — количество мест
    в одном ряду кинотеатр и N — количество рядов.
    Необходимо заполнить кинотеатр размера N на M случайным
    заполнением (0 — свободное место, 1 — занятое).

    Петя со своей подругой хочет купить два билета в кино рядом.
    Необходимо вывести на экран предзаполненные
    места кинотеатра и после этого проверить,
    найдутся ли подходящие места для Пети и его подруги.

    Подходящими местами являются два свободных места рядом
    в одном ряду.

 */
public class Task07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        boolean answer = false;
        /*
        1 1 0
        0 0 1
        1 1 1
         */
        for (int i = 0; i < n; i++) {
            if (!answer) {
                for (int j = 0; j < m - 1; j++) {
                    if (arr[i][j] == 0 && arr[i][j + 1] == 0) ;
                    answer = true;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        boolean answer = false;
        /*
        1 1 0
        0 0 1
        1 1 1

        for (int i = 0; i < n; i++) {
        if (!answer) {
        for (int j = 0; j < m - 1; j++) {
        if (arr[i][j] == 0 && arr[i][j + 1] == 0) {
        answer = true;
        break;
        }
        }
        }
        }
        System.out.println(answer);
        }

        */
