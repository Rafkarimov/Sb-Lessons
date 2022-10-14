package main.java20221014;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        a = scanner.nextInt();

        System.out.println("Введите значение b: ");
        b = scanner.nextInt();

        System.out.println("Получаем результат a: " + a + " Получаем результат b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Получаем результат a: " + a + " Получаем результат b: " + b);

    }
}
