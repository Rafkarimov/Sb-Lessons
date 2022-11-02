package main.dop.if01;

import java.util.Scanner;

/*
6.8
Напишите класс, который принимает с клавиатуры два целых числа и, если первое больше второго, выводит на экран
их сумму, если же наоборот - выводит на экран их произведение.  В случае же, если числа одинаковы, программа выводит
на экран сообщение Числа равны.
 */
public class IfOne04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + num2);
        }
        if (num1 < num2) {
            System.out.println(num1 * num2);
        }

    }
}
