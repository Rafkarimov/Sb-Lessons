package main.home012;

import java.util.Scanner;

/*
10.	(1 балл) "А логарифмическое?" - не унималась дочь.

Напишите программу, которая проверяет, что log(e^n) == n для любого вещественного n.

Входные данные:
1,0
12,34
-43,1
Выходные данные:
true
true
true
 */
public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        if (Math.log((Math.pow(Math.E, n))) == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}