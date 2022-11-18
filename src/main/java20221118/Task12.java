package main.java20221118;

import java.util.Scanner;

/*
На вход подается целое число N
    Необходимо вычислить факториал числа N

    Вход
    5
    Выход
    120

    Вход
    3

    Выход
    6

 */
public class Task12 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
/*
fact(5)
 */