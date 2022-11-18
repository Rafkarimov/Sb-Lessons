package main.java20221118;

import java.util.Scanner;

public class Task051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int winner = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int current = 0;

            for (int j = 0; j < m; j++) {
                current += arr[i][j];
            }

            if (current >= max) {
                max = current;
                winner = i;
            }
        }

        System.out.println(winner + 1);
    }


    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
