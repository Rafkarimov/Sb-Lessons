package main.home013;

import java.util.Scanner;

/*
На вход подается два положительных числа m и n. Найти сумму чисел между m
и n включительно.
Входные данные:
7 9
1 2
Выходные данные:
24
3
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
