package main.java20221021;

import java.util.Scanner;

/*
Задача 1
Дано четырехзначное целое число. Вывести - является ли оно палиндромом.
Вход Выход
1881 Число является палиндромом
5081 Число не является палиндромом
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int end = input % 10;
        int start = input / 1000;

        if (start != end) {
            System.out.println("Число не является палиндромом");
        } else {
            start = (input / 100) % 10;
            end = (input % 100) / 10;

            if (start != end) {
                System.out.println("Число не является палиндромом");
            } else {
                System.out.println("Число является палиндромом");
            }
        }
    }
}
