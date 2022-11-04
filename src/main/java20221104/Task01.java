package main.java20221104;
    /*
    Дано число n < 13. Найти факториал числа n (n! = 1 * 2 * 3 * …* (n - 1) * n)
    3! = 1 * 2 * 3
    Входные данные Выходные данные
    12              479001600
    7               5040
    1               1

     */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n =  sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // factorial = factorial * i;
        }
        System.out.println("Факториал числа: " + factorial);
    }
}
