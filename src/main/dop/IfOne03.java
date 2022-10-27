package main.dop;

import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры целое положительное число и, если оно как минимум
трехзначное и положительное, уменьшает его на 1
 */
public class IfOne03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num / 100 % 10 > 0) {
            num -= 1;
            System.out.println(num);
        } else {
            System.out.println("Число не трехзначное");
        }
    }
}
