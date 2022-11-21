package main.home022;

import java.util.Scanner;

/*
8.	На вход подается число N. Необходимо посчитать и вывести на экран сумму его цифр.
Решить задачу нужно через рекурсию.

Ограничения:
0 < N < 1000000

Входные данные
12374

201

Выходные данные
17

3

 */
public class HomeWork08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigit(n));

    }

    private static int sumOfDigit(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        sum = n%10 + sumOfDigit(n/10);
        return sum;
    }
}
