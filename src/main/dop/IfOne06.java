package main.dop;

import java.util.Scanner;

/*
Напишите программу (класс), которая принимает с клавиатуры двузначное число и проверяет, что больше: само это число
или произведение его цифр.
 */
public class IfOne06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num/10;
        int num2 = num%10;

        if (num > num1*num2) {
            System.out.println("Само число больше, произведения его чисел");
        } else {
            System.out.println("Произведения чисел больше самого числа");
        }
    }
}
