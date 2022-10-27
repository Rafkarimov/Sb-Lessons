package main.dop;
/*
6.5
Напишите класс, который принимает с клавиатуры целое число и, если
оно равно нулю, выводит на экран сообщение Ноль.
 */

import java.util.Scanner;

public class IfOne01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("0");
        }
    }
}
