package main.java20221021;

import java.util.Scanner;

/*
Задача 5
Даны три целых числа a, b, c. Проверить есть ли среди них прямо противоположные. (
5 и -5 прямо противоположные числа)
Вход Выход
-1 1 0 true
-1 0 -1 false
-1 1 1 true
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a == -1 * b && a != 0) || (a == -1 * c && a != 0) || (c == -1 * b && c != 0));
    }
}
