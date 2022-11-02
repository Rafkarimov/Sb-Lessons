package main.java106;
/*
Напишите программу с интерактивным циклом проверки правильности ввода данных, считывающую пары целых чисел до тех
пор, пока не встретит пару, в которой одно из чисел кратно другому.
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.println("Введите первое число: ");
            num1 = sc.nextInt();
            System.out.println("Введите второе число: ");
            num2 = sc.nextInt();
        } while ((num1 % num2 != 0) && (num2 % num1 != 0));

    }
}
