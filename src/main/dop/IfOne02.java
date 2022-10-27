package main.dop;
/*
6.6
Напишите класс, который принимает с клавиатуры целое число и выводит на экран одно из следующих сообщений:
Положительное, или Отрицательное, или Ноль, - в зависимости от значения числа.
 */

import java.util.Scanner;

public class IfOne02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Положительное");
        } else if (num < 0) {
            System.out.println("Отрицательное");
        } else if (num == 0) {
            System.out.println("Ноль");
        }
    }
}
