package main.java20221104;

import java.util.Scanner;

/*
   Дано целое число n. Найти n число Фибоначчи с помощью цикла.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946

    Входные данные
    28
    Выходные данные
    317811

    Входные данные
    16
    Выходные данные
    987

 */
public class Task06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fib0 = 0;
        int fib1 = 1;

        if (n==0) {
            System.out.println(fib0);
            return;
        }
        if (n == 1) {
            System.out.println(fib1);
            return;
        }

        int fibResult = 1;
        for (int i = 2; i <= n; i++) {
            fibResult = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibResult;
        }
        System.out.println(fibResult);
    }
}
