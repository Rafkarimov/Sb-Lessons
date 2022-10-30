package main.home013;

import java.util.Scanner;

/*
Даны положительные натуральные числа m и n. Найти остаток от деления m на
n, не выполняя операцию взятия остатка.
Входные данные:
9 1
8 3
7 9
Выходные данные:
0
2
7
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 - (num1/num2)*num2);

    }
}
