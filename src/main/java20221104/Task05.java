package main.java20221104;

import java.util.Scanner;

/*
    Дано целое число n. Вывести сумму всех цифр этого числа.
    Входные данные
    92180
    Выходные данные
    20

    Входные данные
    52775
    Выходные данные
    26

 */
public class Task05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
