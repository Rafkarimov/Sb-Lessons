package main.java20221104;

import java.util.Scanner;

/*
    Даны два числа m и n.
    Найти произведение чисел в диапазоне между m и n включительно.
    (m < 14 и n < 14), m < n

    Входные данные  Выходные данные
    4 12            79833600
    3 7             2520

 */
public class Task02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = 1;

        for (int i = m; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
