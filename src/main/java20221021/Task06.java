package main.java20221021;

import java.util.Scanner;

/*
Задача 6
Даны три целых числа a, b, c . Найти сумму двух чисел больших из них.
Вход Выход
21 0 8         29
60 9 6         69
62 4 1         66
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.min(Math.max(a, b), Math.max(b, c)) + Math.max(a, Math.max(b, c)));

        int sum;
        if (a > b || a > c) {
            if (b > c) sum = a + b; else sum = a + c;
        } else sum = b + c;

    }
}
