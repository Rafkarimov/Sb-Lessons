package main.java20221021;

/*
Задача 2
Дано целое число n. Вывести - является ли число четным.
Вход Выход
4 true
1 false
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n % 2 == 0);
    }
}
